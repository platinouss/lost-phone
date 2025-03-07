package ktphone.domain;

import java.time.LocalDate;
import java.util.*;
import ktphone.infra.AbstractEvent;
import lombok.Data;

@Data
public class UsimBlocked extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long deviceId;
    private String status;
}
