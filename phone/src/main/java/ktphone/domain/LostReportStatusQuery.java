package ktphone.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "LostReportStatusQuery_table")
@Data
public class LostReportStatusQuery {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
