package com.projeto.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.apirest.repository.PessoaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.projeto.apirest.models.Pessoa;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pessoas")
@CrossOrigin(origins="*")
public class PessoaResource {
	
	// injection point to be able to use the methods to connect to the database
	@Autowired
	PessoaRepository pessoaRepository;

	// Listing all the people
	@GetMapping("/pessoas")
	@ApiOperation(value="Método que lista todas as pessoas")
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.findAll();
	}
	
	//Listing single person
	@GetMapping("/pessoa/{id}")
	@ApiOperation(value="Método que lista uma única pessoa")
	public Pessoa listaPessoaUnica(@PathVariable(value="id") long id){
		return pessoaRepository.findById(id);
	}
	
	// Save a person
	@PostMapping("/pessoa")
	@ApiOperation(value="Método que salva uma pessoa")
	public Pessoa salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	//Delete a person
	@DeleteMapping("/pessoa")
	@ApiOperation(value="Método que deleta uma pessoa")
	public void deletaPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}
	
	//Update a person
	@PutMapping("/pessoa")	
	@ApiOperation(value="Método que atualiza uma pessoa")
	public Pessoa atualizaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
}
