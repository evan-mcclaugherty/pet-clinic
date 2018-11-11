package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Vet;
import evnmck.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
