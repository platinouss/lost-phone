package ktphone.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ktphone.config.kafka.KafkaProcessor;
import ktphone.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    UsimBlockHistoryRepository usimBlockHistoryRepository;

    @Autowired
    VerificationInfoRepository verificationInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UsimBlocked'"
    )
    public void wheneverUsimBlocked_SendUsimBlockMessage(
        @Payload UsimBlocked usimBlocked
    ) {
        UsimBlocked event = usimBlocked;
        System.out.println(
            "\n\n##### listener SendUsimBlockMessage : " + usimBlocked + "\n\n"
        );

        // Sample Logic //
        UsimBlockHistory.sendUsimBlockMessage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UsimUnblocked'"
    )
    public void wheneverUsimUnblocked_SendUsimUnblockMessage(
        @Payload UsimUnblocked usimUnblocked
    ) {
        UsimUnblocked event = usimUnblocked;
        System.out.println(
            "\n\n##### listener SendUsimUnblockMessage : " +
            usimUnblocked +
            "\n\n"
        );

        // Sample Logic //
        UsimBlockHistory.sendUsimUnblockMessage(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
