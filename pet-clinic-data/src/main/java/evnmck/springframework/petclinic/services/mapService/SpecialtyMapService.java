package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Specialty;
import evnmck.springframework.petclinic.services.SpecialtyService;

public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }
}
