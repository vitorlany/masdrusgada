package com.example.masdrusgada.infrastructure.models;

public enum StatusFrete {
    COLETA("Aguardando coleta"),
    POSTADO("Postado"),
    TRANSITO("Em transito"),
    ENTREGUE("Entregue");

    private String descricao;

    StatusFrete(String toString) {
        this.descricao = toString;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
