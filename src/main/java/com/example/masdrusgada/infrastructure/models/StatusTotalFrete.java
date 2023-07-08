package com.example.masdrusgada.infrastructure.models;

import java.util.Stack;

public class StatusTotalFrete {
    private String responsavel;
    private int prazoEmDias;
    private double valor;
    private Stack<FaseDeEntrega> fases;
    private StatusFrete status;

    public StatusTotalFrete(String responsavel, int prazoEmDias, double valor) {
        this.responsavel = responsavel;
        this.prazoEmDias = prazoEmDias;
        this.valor = valor;
        this.fases = new Stack<>();
        this.status = StatusFrete.COLETA;
    }

    public void adicionarFase(String fase) {
        FaseDeEntrega novaFase = new FaseDeEntrega(fase);
        fases.push(novaFase);
    }

    public String getStatus() {
        return status.toString();
    }
}