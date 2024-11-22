package org.example.lab10_20210795;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping({"principal", "principal/"})
public class Controller {
    @GetMapping("/tareas")
    public String PaginaPrincipal() {
        return "principal";
    }
}
