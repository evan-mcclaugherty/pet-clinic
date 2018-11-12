package evnmck.springframework.petclinic.bootstrap;

import evnmck.springframework.petclinic.model.*;
import evnmck.springframework.petclinic.services.OwnerService;
import evnmck.springframework.petclinic.services.PetTypeService;
import evnmck.springframework.petclinic.services.SpecialtyService;
import evnmck.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");

        Specialty dentistry = new Specialty();
        surgery.setDescription("Dentistry");
        Specialty savedDentistryd = specialtyService.save(dentistry);
        Specialty savedSurgery = specialtyService.save(surgery);
        Specialty savedRadiology = specialtyService.save(radiology);

        Owner owner1 = new Owner();
        owner1.setFirstName("Evan");
        owner1.setAddress("123 Main St");
        owner1.setTelephone("21341345234");
        owner1.setCity("Bigday");
        owner1.setLastName("Mack");
        Pet owner1Pet = new Pet();
        owner1Pet.setName("Fido");
        owner1Pet.setBirthday(LocalDate.of(1982, 1, 23));
        owner1Pet.setPetType(savedDogType);
        owner1Pet.setOwner(owner1);
        owner1.getPets().add(owner1Pet);
        ownerService.save(owner1);

        Owner ownder2 = new Owner();
        ownder2.setFirstName("Sean");
        ownder2.setAddress("543 Big Bird");
        ownder2.setTelephone("432123423543");
        ownder2.setCity("Monay");
        ownder2.setLastName("Carter");
        Pet owner2Pet = new Pet();
        owner2Pet.setOwner(ownder2);
        owner2Pet.setPetType(savedCatType);
        owner2Pet.setBirthday(LocalDate.now());
        owner2Pet.setName("Biscuits");
        ownder2.getPets().add(owner2Pet);
        ownerService.save(ownder2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bill");
        vet1.setLastName("Johnson");
        vet1.getSpecialties().add(savedDentistryd);
        vet1.getSpecialties().add(savedSurgery);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Shirley");
        vet2.setLastName("Cannon");
        vet2.getSpecialties().add(savedRadiology);
        vet2.getSpecialties().add(savedDentistryd);
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
