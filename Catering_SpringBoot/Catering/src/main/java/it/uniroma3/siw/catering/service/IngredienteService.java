package it.uniroma3.siw.catering.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Ingrediente;
import it.uniroma3.siw.catering.repository.IngredienteRepository;

@Service
public class IngredienteService {
	
	@Autowired
	private IngredienteRepository ingredienteRepository;
	
	@Transactional
	public Ingrediente save(Ingrediente ingrediente) {
		return ingredienteRepository.save(ingrediente);
	}

	@Transactional
	public List<Ingrediente> getAllIngredientes() {
		return (List<Ingrediente>)ingredienteRepository.findAll();
	}

	@Transactional
	public Ingrediente findById(Long id) {
		return ingredienteRepository.findById(id).get();
	}
}
