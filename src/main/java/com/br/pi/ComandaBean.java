package com.br.pi;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import com.br.pi.produto.Produto;

@Component
@SessionScoped
public class ComandaBean implements Serializable{

    private Float total;

    private Produto produtoSelecionado;

    private Integer quantidade = 1;

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Produto getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void takeProduct(Produto produto) {
        this.produtoSelecionado = produto;
    }

}
