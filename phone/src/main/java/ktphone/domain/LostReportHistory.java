package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.PhoneApplication;
import lombok.Data;

@Entity
@Table(name = "LostReportHistory_table")
@Data
//<<< DDD / Aggregate Root
public class LostReportHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long deviceId;

    private Long userId;

    private String status;

    private Date reportedAt;

    private Date clearedAt;

    private String contents;

    public static LostReportHistoryRepository repository() {
        LostReportHistoryRepository lostReportHistoryRepository = PhoneApplication.applicationContext.getBean(
            LostReportHistoryRepository.class
        );
        return lostReportHistoryRepository;
    }

    //<<< Clean Arch / Port Method
    public void lostReport(LostReportCommand lostReportCommand) {
        //implement business logic here:

        LostReportRequested lostReportRequested = new LostReportRequested(this);
        lostReportRequested.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void lostClearance(LostClearanceCommand lostClearanceCommand) {
        //implement business logic here:

        LostClearanceRequested lostClearanceRequested = new LostClearanceRequested(
            this
        );
        lostClearanceRequested.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
