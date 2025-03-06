package ktphone.domain;

import java.time.LocalDate;
import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PhoneRegistered extends AbstractEvent {

    private Long id;
    private Long deviceId;
    private Long userId;
    private String deviceType;
    private String deviceModel;
    private String deviceStatus;

    public PhoneRegistered(Device aggregate) {
        super(aggregate);
    }

    public PhoneRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
