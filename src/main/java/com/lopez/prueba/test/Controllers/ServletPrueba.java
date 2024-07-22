package com.lopez.prueba.test.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class ServletPrueba {

    @RequestMapping("/hola")
    public String hola() {
        return "Hola Mundo";
    }

}
