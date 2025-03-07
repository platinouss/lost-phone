package ktphone.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import ktphone.config.kafka.KafkaProcessor;
import ktphone.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class SearchReportViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private SearchReportRepository searchReportRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenLostReportRequested_then_CREATE_1(
        @Payload LostReportRequested lostReportRequested
    ) {
        try {
            if (!lostReportRequested.validate()) return;

            // view 객체 생성
            SearchReport searchReport = new SearchReport();
            // view 객체에 이벤트의 Value 를 set 함
            searchReport.setUserId(lostReportRequested.getUserId());
            searchReport.setDeviceId(lostReportRequested.getDeviceId());
            searchReport.setStatus(lostReportRequested.getStatus());
            searchReport.setReportedAt(lostReportRequested.getReportedAt());
            searchReport.setClearedAt(lostReportRequested.getClearedAt());
            searchReport.setContents(lostReportRequested.getContents());
            // view 레파지 토리에 save
            searchReportRepository.save(searchReport);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenUsimBlocked_then_UPDATE_1(
        @Payload UsimBlocked usimBlocked
    ) {
        try {
            if (!usimBlocked.validate()) return;
            // view 객체 조회

            List<SearchReport> searchReportList = searchReportRepository.findByStatus(
                usimBlocked.getStatus()
            );
            for (SearchReport searchReport : searchReportList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                searchReport.setDeviceId(usimBlocked.getDeviceId());
                // view 레파지 토리에 save
                searchReportRepository.save(searchReport);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
