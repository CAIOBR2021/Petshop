package com.caio.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.caio.petshop.domain.Raca;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Integer> {
	
}
