package ktphone.domain;

import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class UsimBlocked extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long deviceId;
}
