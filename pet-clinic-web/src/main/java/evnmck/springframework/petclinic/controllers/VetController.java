package evnmck.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {
    @GetMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String listVets() {

        return "vets/index";
    }
}
