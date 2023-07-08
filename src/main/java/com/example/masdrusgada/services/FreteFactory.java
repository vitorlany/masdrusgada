package com.example.masdrusgada.services;

import com.example.masdrusgada.infrastructure.models.fretes.Aereo;
import com.example.masdrusgada.infrastructure.models.fretes.Ferroviario;
import com.example.masdrusgada.infrastructure.models.fretes.Fretavel;
import com.example.masdrusgada.infrastructure.models.fretes.Rodoviario;

public class FreteFactory {
    private FreteFactory() {}

    public static Fretavel getFrete(int dias) {
        if (dias < 7) {
            return new Aereo();
        } else if (dias < 15) {
            return new Rodoviario();
        }
        return new Ferroviario();
    }
}