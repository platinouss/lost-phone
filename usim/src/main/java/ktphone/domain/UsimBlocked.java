package ktphone.domain;

import java.time.LocalDate;
import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class UsimBlocked extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long deviceId;
    private String phoneNumber;
    private String status;

    public UsimBlocked(Usim aggregate) {
        super(aggregate);
    }

    public UsimBlocked() {
        super();
    }
}
//>>> DDD / Domain Event
