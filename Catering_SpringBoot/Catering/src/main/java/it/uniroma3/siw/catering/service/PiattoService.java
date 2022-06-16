package it.uniroma3.siw.catering.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Ingrediente;
import it.uniroma3.siw.catering.model.Piatto;
import it.uniroma3.siw.catering.repository.PiattoRepository;

@Service
public class PiattoService {
	
	@Autowired
	private PiattoRepository piattoRepository;
	
	@Transactional
	public Piatto aggiungiPiatto(Piatto piatto) {
		return piattoRepository.save(piatto);
	}
	
	@Transactional
	public Piatto findById(Long id) {
		return piattoRepository.findById(id).get();
	}

	@Transactional
	public List<Piatto> getAllDishes() {
		return (List<Piatto>)piattoRepository.findAll();
	}
	
}
