package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Vet;

public class VetMapService extends AbstractMapService<Vet, Long> {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
