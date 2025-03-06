package ktphone.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ktphone.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/lostReportHistories")
@Transactional
public class LostReportHistoryController {

    @Autowired
    LostReportHistoryRepository lostReportHistoryRepository;

    @RequestMapping(
        value = "/lostReportHistories/{id}/lostreport",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public LostReportHistory lostReport(
        @PathVariable(value = "id") Long id,
        @RequestBody LostReportCommand lostReportCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /lostReportHistory/lostReport  called #####");
        Optional<LostReportHistory> optionalLostReportHistory = lostReportHistoryRepository.findById(
            id
        );

        optionalLostReportHistory.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        LostReportHistory lostReportHistory = optionalLostReportHistory.get();
        lostReportHistory.lostReport(lostReportCommand);

        lostReportHistoryRepository.save(lostReportHistory);
        return lostReportHistory;
    }

    @RequestMapping(
        value = "/lostReportHistories/{id}/lostclearance",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public LostReportHistory lostClearance(
        @PathVariable(value = "id") Long id,
        @RequestBody LostClearanceCommand lostClearanceCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /lostReportHistory/lostClearance  called #####"
        );
        Optional<LostReportHistory> optionalLostReportHistory = lostReportHistoryRepository.findById(
            id
        );

        optionalLostReportHistory.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        LostReportHistory lostReportHistory = optionalLostReportHistory.get();
        lostReportHistory.lostClearance(lostClearanceCommand);

        lostReportHistoryRepository.save(lostReportHistory);
        return lostReportHistory;
    }
}
//>>> Clean Arch / Inbound Adaptor
