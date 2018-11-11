package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Pet;
import evnmck.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet , Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
