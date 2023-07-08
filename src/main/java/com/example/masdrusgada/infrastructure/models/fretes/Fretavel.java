package com.example.masdrusgada.infrastructure.models.fretes;

import com.example.masdrusgada.infrastructure.models.StatusTotalFrete;

public interface Fretavel {
    StatusTotalFrete enviar(double peso);

    double getPrecoPorKilo();

    default double getValorFrete(double peso) {
        return peso * this.getPrecoPorKilo();
    }
}
