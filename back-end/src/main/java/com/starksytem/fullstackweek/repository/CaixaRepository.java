package com.starksytem.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.starksytem.fullstackweek.domain.Caixa;


public interface CaixaRepository extends JpaRepository<Caixa, Long>{
    
}
