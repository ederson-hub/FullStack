package com.starksytem.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.starksytem.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, Long> {

}
