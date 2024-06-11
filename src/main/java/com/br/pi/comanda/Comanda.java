package com.br.pi.comanda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.br.pi.mesa.Mesa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comanda")//?????????
public class Comanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_comanda;

    @ManyToOne//??????????
    @JoinColumn(name = "id_mesa")//??????????
    private Mesa mesa = new Mesa();//?????????? object

    private Float valor_total;

    //enum statusComanda(criar)

    //enum metodoPagamento(criar)

    //lista de itens(criar)

}
