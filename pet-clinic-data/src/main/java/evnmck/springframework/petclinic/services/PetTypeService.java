package evnmck.springframework.petclinic.services;

import evnmck.springframework.petclinic.model.PetType;
import evnmck.springframework.petclinic.repositories.PetTypeRepository;

import java.util.HashSet;
import java.util.Set;

public class PetTypeService implements CrudService<PetType, Long> {
    private final PetTypeRepository petTypeRepository;

    public PetTypeService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    public PetType findByName(String name) {
        return petTypeRepository.findByName(name);
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
