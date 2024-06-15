package com.br.pi.comanda;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@SessionScoped
@Controller
public class ComandaControl {
    private Comanda comanda = new Comanda();

    private List<Comanda> comandas = new ArrayList<>();

    @Autowired
    private ComandaDao comandaDao;

    @PostConstruct
    public void init() {
        comandas = comandaDao.findAll();
    }

    public void salvar(RowEditEvent<Comanda> event) {
        comandaDao.save(event.getObject());
    }

}
