package evnmck.springframework.petclinic.controllers;

import evnmck.springframework.petclinic.services.mapService.OwnerMapService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @GetMapping({"", "/", "/index", "index.html"})
    public String listPetOwners(Model model) {
        model.addAttribute("owners", this.ownerMapService.findAll());
        return "owners/index";
    }
    @GetMapping("/find")
    public String find(Model model) {
        return "notimplemented";
    }
}
