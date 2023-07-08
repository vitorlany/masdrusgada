package com.example.masdrusgada.infrastructure.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Getter
public class StatusTotalFrete {
    private String responsavel;
    private int prazoEmDias;
    private double valor;
    private List<FaseDeEntrega> fases;
    private StatusFrete status;

    public StatusTotalFrete(String responsavel, int prazoEmDias, double valor) {
        this.responsavel = responsavel;
        this.prazoEmDias = prazoEmDias;
        this.valor = valor;
        this.fases = new LinkedList<>();
        this.status = StatusFrete.COLETA;
    }

    public void adicionarFase(String fase) {
        FaseDeEntrega novaFase = new FaseDeEntrega(fase);
        fases.add(novaFase);
    }

    public void adicionarFase(String fase, StatusFrete status) {
        this.adicionarFase(fase);
        this.status = status;
    }

    public String getStatus() {
        return status.toString();
    }

    public List<FaseDeEntrega> getFases() {
        List<FaseDeEntrega> res = new ArrayList<>(fases);
        Collections.reverse(res);
        return res;
    }
}
