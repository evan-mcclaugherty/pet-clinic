package evnmck.springframework.petclinic.controllers;

import evnmck.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerMapService) {
        this.ownerService = ownerMapService;
    }

    @GetMapping({"", "/", "/index", "index.html"})
    public String listPetOwners(Model model) {
        model.addAttribute("owners", this.ownerService.findAll());
        return "owners/index";
    }
    @GetMapping("/find")
    public String find(Model model) {
        return "notimplemented";
    }
}
