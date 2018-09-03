package evnmck.springframework.petclinic.services;

import evnmck.springframework.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);
}
