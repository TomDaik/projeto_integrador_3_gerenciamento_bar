package com.br.pi.home;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

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

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }


}
