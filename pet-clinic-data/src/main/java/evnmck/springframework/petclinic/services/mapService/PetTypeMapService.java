package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.PetType;
import evnmck.springframework.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
