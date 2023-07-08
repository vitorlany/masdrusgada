package com.example.masdrusgada.infrastructure.models;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class FaseDeEntrega {
    private String detalhe;
    private LocalDateTime data;

    public FaseDeEntrega(String detalhe) {
        this.detalhe = detalhe;
        this.data = LocalDateTime.now();
    }
}
