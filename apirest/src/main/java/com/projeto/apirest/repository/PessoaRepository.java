package com.projeto.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.apirest.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	Pessoa findById(long id);
	
}
