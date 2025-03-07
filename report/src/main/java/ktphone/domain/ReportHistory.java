package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.ReportApplication;
import ktphone.domain.LostClearanceRequested;
import ktphone.domain.LostReportRequested;
import lombok.Data;

@Entity
@Table(name = "ReportHistory_table")
@Data
//<<< DDD / Aggregate Root
public class ReportHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long deviceId;

    private Long userId;

    private String status;

    private Date reportedAt;

    private Date clearedAt;

    private String contents;

    @PostPersist
    public void onPostPersist() {
        LostReportRequested lostReportRequested = new LostReportRequested(this);
        lostReportRequested.publishAfterCommit();

        LostClearanceRequested lostClearanceRequested = new LostClearanceRequested(
            this
        );
        lostClearanceRequested.publishAfterCommit();
    }

    public static ReportHistoryRepository repository() {
        ReportHistoryRepository reportHistoryRepository = ReportApplication.applicationContext.getBean(
            ReportHistoryRepository.class
        );
        return reportHistoryRepository;
    }

    public void LostReport() {
        //
    }
}
//>>> DDD / Aggregate Root
