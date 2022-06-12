package it.uniroma3.siw.catering.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Piatto;
import it.uniroma3.siw.catering.repository.PiattoRepository;

@Service
public class PiattoService {
	
	@Autowired
	private PiattoRepository piattoRepo;
	
	@Transactional
	public Piatto aggiungiPiatto(Piatto piatto) {
		return piattoRepo.save(piatto);
	}
	
	
}
