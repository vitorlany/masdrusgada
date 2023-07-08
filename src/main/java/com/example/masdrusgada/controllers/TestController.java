package com.example.masdrusgada.controllers;

import com.example.masdrusgada.infrastructure.models.StatusFrete;
import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public StatusTotalFrete test() {
        StatusTotalFrete frete = new StatusTotalFrete("Teste", 15, 1_500);
        frete.adicionarFase("Nova");
        frete.adicionarFase("Nova Segunda", StatusFrete.TRANSITO);
        return frete;
    }
}