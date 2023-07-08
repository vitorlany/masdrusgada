package com.example.masdrusgada.controllers;

import com.example.masdrusgada.infrastructure.models.StatusFrete;
import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public StatusTotalFrete test() {
        StatusTotalFrete frete = new StatusTotalFrete("Teste", 1_500.69);
        frete.adicionarFase("Nova");
        frete.adicionarFase("Segunda", StatusFrete.TRANSITO);
        return frete;
    }
}
