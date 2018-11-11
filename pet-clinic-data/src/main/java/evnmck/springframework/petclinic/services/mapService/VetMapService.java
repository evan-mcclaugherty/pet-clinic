package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Vet;
import evnmck.springframework.petclinic.services.VetService;

public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
