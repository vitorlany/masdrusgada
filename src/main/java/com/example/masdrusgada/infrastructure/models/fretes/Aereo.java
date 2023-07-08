package com.example.masdrusgada.infrastructure.models.fretes;

import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;

public class Aereo implements Fretavel {
    private static final String DESCRICAO = "Aéreo";

    @Override
    public StatusTotalFrete enviar(double peso) {
        return new StatusTotalFrete(Aereo.DESCRICAO, this.getValorFrete(peso));
    }

    @Override
    public double getPrecoPorKilo() {
        return 60;
    }
}
