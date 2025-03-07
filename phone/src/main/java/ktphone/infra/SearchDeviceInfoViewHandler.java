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
public class SearchDeviceInfoViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private SearchDeviceInfoRepository searchDeviceInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPhoneRegistered_then_CREATE_1(
        @Payload PhoneRegistered phoneRegistered
    ) {
        try {
            if (!phoneRegistered.validate()) return;

            // view 객체 생성
            SearchDeviceInfo searchDeviceInfo = new SearchDeviceInfo();
            // view 객체에 이벤트의 Value 를 set 함
            searchDeviceInfo.setUserId(phoneRegistered.getUserId());
            searchDeviceInfo.setDeviceType(phoneRegistered.getDeviceType());
            searchDeviceInfo.setDeviceModel(phoneRegistered.getDeviceModel());
            searchDeviceInfo.setDeviceStatus(phoneRegistered.getDeviceStatus());
            // view 레파지 토리에 save
            searchDeviceInfoRepository.save(searchDeviceInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
