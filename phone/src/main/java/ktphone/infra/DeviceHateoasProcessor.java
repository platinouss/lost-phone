package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeviceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Device>> {

    @Override
    public EntityModel<Device> process(EntityModel<Device> model) {
        return model;
    }
}
