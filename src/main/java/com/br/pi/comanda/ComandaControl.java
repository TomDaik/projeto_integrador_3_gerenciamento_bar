package com.br.pi.comanda;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class ComandaControl {

    private Comanda comanda = new Comanda();

    private List<Comanda> comandas = new ArrayList<>();

    private List<Comanda> comandasVendidas = new ArrayList<>();

    @Autowired
    private ComandaDao comandaDao;

    @PostConstruct
    public void init() {
        comandas = comandaDao.findAll();
    }

    public void salvar(RowEditEvent<Comanda> event) {
        comandaDao.save(event.getObject());
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    public void addComandaVendida() {
        for (Comanda comanda : comandas) {
            if (comanda.getComandaStatus().equals(ComandaStatus.FECHADA)) {
                comandasVendidas.add(comanda);
            }
        }
    }

    public List<Comanda> getComandasVendidas() {
        return comandasVendidas;
    }

    public void setComandasVendidas(List<Comanda> comandasVendidas) {
        this.comandasVendidas = comandasVendidas;
    }
}
