package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Pet;

public class PetMapService extends AbstractMapService<Pet , Long> {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
