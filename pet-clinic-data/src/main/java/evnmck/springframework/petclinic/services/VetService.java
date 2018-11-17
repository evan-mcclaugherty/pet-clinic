package evnmck.springframework.petclinic.services;

import evnmck.springframework.petclinic.model.Vet;
import evnmck.springframework.petclinic.repositories.VetRepository;

import java.util.HashSet;
import java.util.Set;

public class VetService implements CrudService<Vet, Long> {
    private final VetRepository vetRepository;

    public VetService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vet -> vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return null;
    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
