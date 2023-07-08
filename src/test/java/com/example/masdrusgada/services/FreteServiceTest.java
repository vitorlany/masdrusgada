package com.example.masdrusgada.services;

import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;
import com.example.masdrusgada.infrastructure.models.fretes.Fretavel;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@RequiredArgsConstructor
class FreteServiceTest {

    private FreteService freteService;

    @BeforeEach
    void setUp() {
        freteService = new FreteService();
    }

    @Test
    void testGetFreteIdeal() {
        Fretavel frete = freteService.getFreteIdeal(5);
        StatusTotalFrete rastreio = freteService.enviarFrete(frete, 15);
    }
}