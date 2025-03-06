package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UsimBlockHistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UsimBlockHistory>> {

    @Override
    public EntityModel<UsimBlockHistory> process(
        EntityModel<UsimBlockHistory> model
    ) {
        return model;
    }
}
