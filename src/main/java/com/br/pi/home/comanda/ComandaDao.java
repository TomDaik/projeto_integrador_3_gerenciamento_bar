package com.br.pi.home.comanda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandaDao extends JpaRepository<Comanda, Integer>{

}
