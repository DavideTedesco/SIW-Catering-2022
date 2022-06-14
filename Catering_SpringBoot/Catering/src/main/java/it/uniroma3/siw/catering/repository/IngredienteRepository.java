package it.uniroma3.siw.catering.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.uniroma3.siw.catering.model.Buffet;
import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.model.Ingrediente;

public interface IngredienteRepository extends CrudRepository<Ingrediente, Long> {

//	@Query("SELECT ingredientes FROM Ingrediente i WHERE i =: ingrediente")
//	public List<Ingrediente> getAllIngredientes(@Param("ingrediente")Ingrediente ingrediente);

}
