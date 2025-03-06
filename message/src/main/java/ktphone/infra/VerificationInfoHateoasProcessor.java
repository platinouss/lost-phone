package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VerificationInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VerificationInfo>> {

    @Override
    public EntityModel<VerificationInfo> process(
        EntityModel<VerificationInfo> model
    ) {
        return model;
    }
}
