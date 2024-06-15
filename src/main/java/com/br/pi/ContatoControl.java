package com.br.pi;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class ContatoControl {
 
    private Contato contato = new Contato();

    private List<Contato> contatos = new ArrayList<>();

    @Autowired
    private ContatoDao contatoDao;

    @PostConstruct
    public void iniciar(){
        contatos = contatoDao.findAll();
    }


    public void salvar(RowEditEvent<Contato> event) {
        contatoDao.save(event.getObject());

    }    

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    

}

