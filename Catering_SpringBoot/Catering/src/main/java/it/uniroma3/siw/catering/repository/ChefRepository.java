package it.uniroma3.siw.catering.repository;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.catering.model.Buffet;

public interface ChefRepository extends CrudRepository<Buffet, Long> {

}
