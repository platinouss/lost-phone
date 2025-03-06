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
    UsimRepository usimRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportRequested'"
    )
    public void wheneverLostReportRequested_BlockUsim(
        @Payload LostReportRequested lostReportRequested
    ) {
        LostReportRequested event = lostReportRequested;
        System.out.println(
            "\n\n##### listener BlockUsim : " + lostReportRequested + "\n\n"
        );

        // Sample Logic //
        Usim.blockUsim(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostClearanceRequested'"
    )
    public void wheneverLostClearanceRequested_UnblockUsim(
        @Payload LostClearanceRequested lostClearanceRequested
    ) {
        LostClearanceRequested event = lostClearanceRequested;
        System.out.println(
            "\n\n##### listener UnblockUsim : " +
            lostClearanceRequested +
            "\n\n"
        );

        // Sample Logic //
        Usim.unblockUsim(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
