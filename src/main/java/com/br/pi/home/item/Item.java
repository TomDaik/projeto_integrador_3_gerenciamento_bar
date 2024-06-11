package com.br.pi.home.item;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.br.pi.home.Produto;
import com.br.pi.home.comanda.Comanda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_item;

    private Comanda comanda = new Comanda();

    //private Produto produto = new Produto();

    private Integer quantidade;

    private Float sub_Total;

    //private List<Produto> produtos = new ArrayList<>();
}
