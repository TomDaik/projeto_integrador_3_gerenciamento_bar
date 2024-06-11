package com.br.pi.home;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comanda;

    private Mesa mesa = new Mesa();//?????????? object

    private Float valor_total;

    //enum statusComanda(criar)

    //enum metodoPagamento(criar)

    //lista de itens(criar)

}
