package com.br.pi.comanda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.br.pi.item.Item;
import com.br.pi.mesa.Mesa;

@Entity
@Table(name = "comanda") // ?????????
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comanda;

    @ManyToOne // ??????????
    @JoinColumn(name = "id_mesa") // ??????????
    private Mesa mesa = new Mesa();// ?????????? object

    private Float valor_total;

    private ComandaStatus comandaStatus;

    private ComandaMetodoPagamento metodoPagamento;

    @OneToMany
    private List<Item> itens = new ArrayList<>();

    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    public Integer getId_comanda() {
        return id_comanda;
    }

    public void setId_comanda(Integer id_comanda) {
        this.id_comanda = id_comanda;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Float getValor_total() {
        return valor_total;
    }

    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

    public ComandaStatus getComandaStatus() {
        return comandaStatus;
    }

    public void setComandaStatus(ComandaStatus comandaStatus) {
        this.comandaStatus = comandaStatus;
    }

    public ComandaMetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(ComandaMetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Date getDataHoraAtual() {
        return dataHoraAtual;
    }

    public void setDataHoraAtual(Date dataHoraAtual) {
        this.dataHoraAtual = dataHoraAtual;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }



}
