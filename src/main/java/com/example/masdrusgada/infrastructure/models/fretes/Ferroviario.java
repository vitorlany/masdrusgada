package com.example.masdrusgada.infrastructure.models.fretes;

import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;

public class Ferroviario implements Fretavel {
    private static final String DESCRICAO = "Ferroviário";

    @Override
    public StatusTotalFrete enviar(double peso) {
        return new StatusTotalFrete(Ferroviario.DESCRICAO, this.getValorFrete(peso));
    }

    @Override
    public double getPrecoPorKilo() {
        return 20;
    }
}
