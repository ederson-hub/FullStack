package com.starksytem.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.starksytem.fullstackweek.domain.Fornecedor;


public interface FornecedorRepository extends JpaRepository <Fornecedor, Long> {
    
}
