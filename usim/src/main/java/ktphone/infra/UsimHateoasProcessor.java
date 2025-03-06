package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UsimHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Usim>> {

    @Override
    public EntityModel<Usim> process(EntityModel<Usim> model) {
        return model;
    }
}
