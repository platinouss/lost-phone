package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.PhoneApplication;
import ktphone.domain.PhoneRegistered;
import lombok.Data;

@Entity
@Table(name = "Device_table")
@Data
//<<< DDD / Aggregate Root
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String deviceType;

    private String deviceModel;

    private String deviceStatus;

    @PostPersist
    public void onPostPersist() {
        PhoneRegistered phoneRegistered = new PhoneRegistered(this);
        phoneRegistered.publishAfterCommit();
    }

    public static DeviceRepository repository() {
        DeviceRepository deviceRepository = PhoneApplication.applicationContext.getBean(
            DeviceRepository.class
        );
        return deviceRepository;
    }
}
//>>> DDD / Aggregate Root
