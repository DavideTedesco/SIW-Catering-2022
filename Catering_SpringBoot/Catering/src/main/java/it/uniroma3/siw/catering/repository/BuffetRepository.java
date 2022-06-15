package it.uniroma3.siw.catering.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.catering.model.Buffet;
import it.uniroma3.siw.catering.model.Chef;

public interface BuffetRepository extends CrudRepository<Buffet, Long>{
	
	public List<Buffet> findByCategoria(String categoria);
	
	//@Query("SELECT b FROM Buffet b WHERE b.chef.nome = :nomeChef AND b.chef.cognome = :cognomeChef")
	//public List<Buffet> ﬁndByChefId(Chef chef);
	
	
}
