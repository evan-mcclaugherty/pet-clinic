package evnmck.springframework.petclinic.repositories;

import evnmck.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
    Pet findByName(String name);
}
