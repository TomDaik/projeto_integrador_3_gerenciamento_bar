package com.br.pi.mesa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class MesaControl {

    private Mesa mesa = new Mesa();
    private Mesa mesaSelecionada;
    private List<Mesa> mesas = new ArrayList<>();
    private String horarioAtual;

    @Autowired
    private MesaDao mesaDao;

    @PostConstruct
    public void iniciar() {
        mesas = mesaDao.findAll();
    }

    public void salvar(RowEditEvent<Mesa> event) {
        mesaDao.save(event.getObject());

    }

    public void selecionarMesa(Mesa mesa) {
        this.mesaSelecionada = mesa;
    }

    public void atualizarHorario() {
        this.horarioAtual = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public Mesa getMesaSelecionada() {
        return mesaSelecionada;
    }

    public void setMesaSelecionada(Mesa mesaSelecionada) {
        this.mesaSelecionada = mesaSelecionada;
    }

    public String getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(String horarioAtual) {
        this.horarioAtual = horarioAtual;
    }

}
