package com.br.pi.item;

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
public class ItemControl {

    private Item item = new Item();

    private List<Item> itens = new ArrayList<>();

    @Autowired
    private ItemDao itemDao;

    @PostConstruct
    public void init() {
        itens = itemDao.findAll();
    }

    public void salvar(RowEditEvent<Item> event) {
        itemDao.save(event.getObject());
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

}
