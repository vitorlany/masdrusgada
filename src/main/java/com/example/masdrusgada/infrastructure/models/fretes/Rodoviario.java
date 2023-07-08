package com.example.masdrusgada.infrastructure.models.fretes;

import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;

public class Rodoviario implements Fretavel{
    private static final String DESCRICAO = "Rodoviário";

    @Override
    public StatusTotalFrete enviar(double peso) {
        return new StatusTotalFrete(Rodoviario.DESCRICAO, this.getValorFrete(peso));
    }

    @Override
    public double getPrecoPorKilo() {
        return 40;
    }
}
