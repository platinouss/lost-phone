package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class LostReportHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LostReportHistory>> {

    @Override
    public EntityModel<LostReportHistory> process(
        EntityModel<LostReportHistory> model
    ) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/lostreport")
                .withRel("lostreport")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/lostclearance")
                .withRel("lostclearance")
        );

        return model;
    }
}
