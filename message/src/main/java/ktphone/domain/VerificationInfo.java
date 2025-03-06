package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.MessageApplication;
import lombok.Data;

@Entity
@Table(name = "VerificationInfo_table")
@Data
//<<< DDD / Aggregate Root
public class VerificationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static VerificationInfoRepository repository() {
        VerificationInfoRepository verificationInfoRepository = MessageApplication.applicationContext.getBean(
            VerificationInfoRepository.class
        );
        return verificationInfoRepository;
    }
}
//>>> DDD / Aggregate Root
