package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.MessageApplication;
import lombok.Data;

@Entity
@Table(name = "UsimBlockHistory_table")
@Data
//<<< DDD / Aggregate Root
public class UsimBlockHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long deviceId;

    private String message;

    public static UsimBlockHistoryRepository repository() {
        UsimBlockHistoryRepository usimBlockHistoryRepository = MessageApplication.applicationContext.getBean(
            UsimBlockHistoryRepository.class
        );
        return usimBlockHistoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void sendUsimBlockMessage(UsimBlocked usimBlocked) {
        //implement business logic here:

        /** Example 1:  new item 
        UsimBlockHistory usimBlockHistory = new UsimBlockHistory();
        repository().save(usimBlockHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(usimBlocked.get???()).ifPresent(usimBlockHistory->{
            
            usimBlockHistory // do something
            repository().save(usimBlockHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void sendUsimUnblockMessage(UsimUnblocked usimUnblocked) {
        //implement business logic here:

        /** Example 1:  new item 
        UsimBlockHistory usimBlockHistory = new UsimBlockHistory();
        repository().save(usimBlockHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(usimUnblocked.get???()).ifPresent(usimBlockHistory->{
            
            usimBlockHistory // do something
            repository().save(usimBlockHistory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
