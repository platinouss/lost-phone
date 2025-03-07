package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.UsimApplication;
import ktphone.domain.UsimBlocked;
import ktphone.domain.UsimUnblocked;
import lombok.Data;

@Entity
@Table(name = "Usim_table")
@Data
//<<< DDD / Aggregate Root
public class Usim {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String phoneNumber;

    private String status;

    private Long deviceId;

    public static UsimRepository repository() {
        UsimRepository usimRepository = UsimApplication.applicationContext.getBean(
            UsimRepository.class
        );
        return usimRepository;
    }

    //<<< Clean Arch / Port Method
    public static void blockUsim(LostReportRequested lostReportRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Usim usim = new Usim();
        repository().save(usim);

        UsimBlocked usimBlocked = new UsimBlocked(usim);
        usimBlocked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportRequested.get???()).ifPresent(usim->{
            
            usim // do something
            repository().save(usim);

            UsimBlocked usimBlocked = new UsimBlocked(usim);
            usimBlocked.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void unblockUsim(
        LostClearanceRequested lostClearanceRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Usim usim = new Usim();
        repository().save(usim);

        UsimUnblocked usimUnblocked = new UsimUnblocked(usim);
        usimUnblocked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(lostClearanceRequested.get???()).ifPresent(usim->{
            
            usim // do something
            repository().save(usim);

            UsimUnblocked usimUnblocked = new UsimUnblocked(usim);
            usimUnblocked.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
