package evnmck.springframework.petclinic.controllers;

import evnmck.springframework.petclinic.model.Owner;
import evnmck.springframework.petclinic.services.CrudService;
import evnmck.springframework.petclinic.services.mapService.OwnerMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final CrudService<Owner, Long> crudService;

    public OwnerController() {
        crudService = new OwnerMapService();
    }

    @GetMapping({"", "/", "/index", "index.html"})
    public String listPetOwners(Model model) {
        model.addAttribute("owners", this.crudService.findAll());
        return "owners/index";
    }
}
