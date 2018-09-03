package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Owner;

public class OwnerMapService extends AbstractMapService<Owner, Long> {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
