package com.nathanael.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathanael.cursomc.domain.Estado;



@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
}
