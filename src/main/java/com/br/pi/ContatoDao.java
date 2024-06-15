package com.br.pi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoDao extends JpaRepository<Contato, Integer>{
    
}

