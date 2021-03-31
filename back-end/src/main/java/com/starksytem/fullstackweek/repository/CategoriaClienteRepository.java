package com.starksytem.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.starksytem.fullstackweek.domain.CategoriaCliente;


public interface CategoriaClienteRepository extends JpaRepository <CategoriaCliente, Long>{

}
