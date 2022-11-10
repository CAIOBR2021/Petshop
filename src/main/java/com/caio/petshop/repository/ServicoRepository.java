package com.caio.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.caio.petshop.domain.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
	
}
