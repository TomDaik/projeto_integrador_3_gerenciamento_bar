package com.br.pi.home;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class SessionManagedBean {

    private String message = "OK ";

    public void acao() {
        message += " Clicou";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String goToPage2() {
        // Qualquer lógica que você queira adicionar
        return "home?faces-redirect=true";
    }
}
