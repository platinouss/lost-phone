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
public class SearchCustomerViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private SearchCustomerRepository searchCustomerRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenRegistered_then_CREATE_1(@Payload Registered registered) {
        try {
            if (!registered.validate()) return;

            // view 객체 생성
            SearchCustomer searchCustomer = new SearchCustomer();
            // view 객체에 이벤트의 Value 를 set 함
            searchCustomer.setName(registered.getName());
            searchCustomer.setPhoneNumber(registered.getPhoneNumber());
            searchCustomer.setEmail(registered.getEmail());
            // view 레파지 토리에 save
            searchCustomerRepository.save(searchCustomer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
