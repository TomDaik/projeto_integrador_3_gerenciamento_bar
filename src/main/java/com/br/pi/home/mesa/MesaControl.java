package com.br.pi.home.mesa;

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
public class MesaControl {
    private Mesa mesa = new Mesa();

    private List<Mesa> mesas = new ArrayList<>();

    @Autowired
    private MesaDao mesaDao;

    @PostConstruct
    public void init(){
        mesas = mesaDao.findAll();
    }

    public void salvar(RowEditEvent<Mesa> event) {
        mesaDao.save(event.getObject());
    }    
}
