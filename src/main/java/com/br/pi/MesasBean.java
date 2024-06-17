package com.br.pi;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class MesasBean implements Serializable{
    

    public String getTime() {
        LocalDate dataAtual = LocalDate.now();
        
        LocalTime horarioAtual = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String dataFormatada = dataAtual.format(dateFormatter);
        String horarioFormatado= horarioAtual.format(timeFormatter);

        String dataVariavel = dataFormatada;
        String horarioVariavel = horarioFormatado;

        return horarioVariavel;
    }
}

