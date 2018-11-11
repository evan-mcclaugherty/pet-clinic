package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Owner;
import evnmck.springframework.petclinic.services.OwnerService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
