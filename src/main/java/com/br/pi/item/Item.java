package com.br.pi.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.br.pi.comanda.Comanda;
import com.br.pi.produto.Produto;

@Entity
@Table(name = "item") // ???????
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_item;

    @ManyToOne // ??????
    @JoinColumn(name = "id_comanda") // ?????
    private Comanda comanda = new Comanda();

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto = new Produto();

    private Integer quantidade;

    private Float sub_Total = (float)0.0;

    public Integer getId_item() {
        return id_item;
    }

    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getSub_Total() {
        return sub_Total;
    }

    public void setSub_Total(Float sub_Total) {
        this.sub_Total = sub_Total;
    }

}
