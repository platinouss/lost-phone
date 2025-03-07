package ktphone.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "SearchReport_table")
@Data
public class SearchReport {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long userId;
    private Long deviceId;
    private String status;
    private Date reportedAt;
    private Date clearedAt;
    private String contents;
}
