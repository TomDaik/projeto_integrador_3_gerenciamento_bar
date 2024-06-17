package com.br.pi.produto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class ProdutoControl {
    private Produto produto = new Produto();

    private List<Produto> produtos = new ArrayList<>();

    @Autowired
    private ProdutoDao produtoDao;

    @PostConstruct
    public void init(){
        produtos = produtoDao.findAll();
    }

    public void salvar(RowEditEvent<Produto> event) {
        produtoDao.save(event.getObject());
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}