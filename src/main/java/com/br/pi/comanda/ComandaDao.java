package com.br.pi.comanda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComandaDao extends JpaRepository<Comanda, Integer>{

}
