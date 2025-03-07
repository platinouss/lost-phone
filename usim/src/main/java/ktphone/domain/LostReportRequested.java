package ktphone.domain;

import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LostReportRequested extends AbstractEvent {

    private Long id;
    private Long deviceId;
    private Long userId;
    private String status;
    private Date reportedAt;
    private Date clearedAt;
    private String contents;
    private Long usimId;
}
