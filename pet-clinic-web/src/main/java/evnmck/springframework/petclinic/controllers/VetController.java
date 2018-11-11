package evnmck.springframework.petclinic.controllers;

import evnmck.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String listVets(Model model) {
        model.addAttribute("vets", this.vetService.findAll());
        return "vets/index";
    }
}
