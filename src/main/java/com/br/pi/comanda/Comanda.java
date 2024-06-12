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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

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

}
