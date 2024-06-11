package com.br.pi.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.br.pi.comanda.Comanda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item")//???????
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_item;

    @ManyToOne//??????
    @JoinColumn(name = "id_comanda")//?????
    private Comanda comanda = new Comanda();

    //private Produto produto = new Produto();

    private Integer quantidade;

    private Float sub_Total;

    //private List<Produto> produtos = new ArrayList<>();
}
