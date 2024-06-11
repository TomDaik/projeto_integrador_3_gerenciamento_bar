package com.br.pi.mesa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaDao extends JpaRepository<Mesa, Integer>{

}
