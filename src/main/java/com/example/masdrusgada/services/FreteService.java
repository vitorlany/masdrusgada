package com.example.masdrusgada.services;

import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;
import com.example.masdrusgada.infrastructure.models.fretes.Fretavel;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public Fretavel getFreteIdeal(int dias) {
        return FreteFactory.getFrete(dias);
    }

    public StatusTotalFrete enviarFrete(Fretavel frete, double peso) {
        return frete.enviar(peso);
    }
}
