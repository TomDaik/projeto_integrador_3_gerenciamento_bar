package com.br.pi.home.mesa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaDao extends JpaRepository<Mesa, Integer>{

}
