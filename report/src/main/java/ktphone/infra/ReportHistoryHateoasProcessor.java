package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReportHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<ReportHistory>> {

    @Override
    public EntityModel<ReportHistory> process(
        EntityModel<ReportHistory> model
    ) {
        return model;
    }
}
