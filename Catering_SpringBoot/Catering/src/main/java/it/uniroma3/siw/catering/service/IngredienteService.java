package it.uniroma3.siw.catering.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Ingrediente;
import it.uniroma3.siw.catering.repository.IngredienteRepository;

@Service
public class IngredienteService {
	
	@Autowired
	private IngredienteRepository ingredienteRepo;
	
	@Transactional
	public Ingrediente save(Ingrediente ingrediente) {
		return ingredienteRepo.save(ingrediente);
	}
}
