package com.mentoria.mentoria1.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Initialize {


    @GetMapping("/test")
    String test() {
        return "Olá, por aqui tá tudo bem!";
    }

}
