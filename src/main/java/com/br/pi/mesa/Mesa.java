package com.br.pi.mesa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.br.pi.comanda.Comanda;

@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_mesa;

    private MesaStatus mesaStatus;

    @OneToMany
    private List<Comanda> comandas = new ArrayList<>();

    public Mesa() {
    }

    public Mesa(Integer id_mesa, MesaStatus mesaStatus) {
        this.id_mesa = id_mesa;
        this.mesaStatus = mesaStatus;
    }

    public Mesa(Integer id_mesa) {
        this.id_mesa = id_mesa;
    }

    public Integer getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(Integer id_mesa) {
        this.id_mesa = id_mesa;
    }
    
    public MesaStatus getMesaStatus() {
        return mesaStatus;
    }

    public void setMesaStatus(MesaStatus mesaStatus) {
        this.mesaStatus = mesaStatus;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

}
