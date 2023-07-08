package com.example.masdrusgada.infrastructure.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Getter
public class StatusTotalFrete {
    private static int CONTADOR = 1;

    private long codRastreio;
    private String responsavel;
    private double valor;
    private List<FaseDeEntrega> fases;
    private StatusFrete status;

    public StatusTotalFrete(String responsavel, double valor) {
        this.codRastreio = StatusTotalFrete.getProxId();
        this.responsavel = responsavel;
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

    public List<FaseDeEntrega> getFases() {
        List<FaseDeEntrega> res = new ArrayList<>(fases);
        Collections.reverse(res);
        return res;
    }

    private static int getProxId() {
        return StatusTotalFrete.CONTADOR++;
    }
}
