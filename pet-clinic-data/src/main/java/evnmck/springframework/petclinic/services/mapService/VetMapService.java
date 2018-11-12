package evnmck.springframework.petclinic.services.mapService;

import evnmck.springframework.petclinic.model.Specialty;
import evnmck.springframework.petclinic.model.Vet;
import evnmck.springframework.petclinic.services.SpecialtyService;
import evnmck.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return null;
    }
}
