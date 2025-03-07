package ktphone.domain;

import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LostClearanceRequested extends AbstractEvent {

    private Long id;
    private Long deviceId;
    private Long userId;
}
