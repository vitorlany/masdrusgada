package com.example.masdrusgada.infrastructure.models;

import java.time.LocalDateTime;

public class FaseDeEntrega {
    private String detalhe;
    private LocalDateTime data;

    public FaseDeEntrega(String detalhe) {
        this.detalhe = detalhe;
        this.data = LocalDateTime.now();
    }
}
