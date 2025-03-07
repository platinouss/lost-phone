package ktphone.domain;

import java.time.LocalDate;
import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LostClearanceRequested extends AbstractEvent {

    private Long id;
    private Long deviceId;
    private Long userId;
    private String status;
    private Date reportedAt;
    private Date clearedAt;
    private String contents;
    private Long usimId;

    public LostClearanceRequested(ReportHistory aggregate) {
        super(aggregate);
    }

    public LostClearanceRequested() {
        super();
    }
}
//>>> DDD / Domain Event
