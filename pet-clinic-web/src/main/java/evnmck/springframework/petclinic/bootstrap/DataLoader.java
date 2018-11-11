package evnmck.springframework.petclinic.bootstrap;

import evnmck.springframework.petclinic.model.Owner;
import evnmck.springframework.petclinic.model.Vet;
import evnmck.springframework.petclinic.services.OwnerService;
import evnmck.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Evan");
        owner1.setLastName("Mack");
        ownerService.save(owner1);

        Owner ownder2 = new Owner();
        ownder2.setFirstName("Sean");
        ownder2.setLastName("Carter");
        ownerService.save(ownder2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bill");
        vet1.setLastName("Johnson");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Shirley");
        vet2.setLastName("Cannon");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");



    }
}