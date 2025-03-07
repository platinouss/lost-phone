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
public class LostReportStatusQueryViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private LostReportStatusQueryRepository lostReportStatusQueryRepository;
    //>>> DDD / CQRS
}
