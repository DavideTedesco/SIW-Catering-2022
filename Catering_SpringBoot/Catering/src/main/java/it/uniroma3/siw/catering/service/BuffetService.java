package it.uniroma3.siw.catering.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Buffet;
import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.repository.BuffetRepository;

@Service
public class BuffetService {
	
	@Autowired
	private BuffetRepository buffetRepository;
	
	@Transactional
	public Buffet save(Buffet buffet) {
		return buffetRepository.save(buffet);
	}
	
	@Transactional
	public List<Buffet> getAllBuffets() {
		return (List<Buffet>) buffetRepository.findAll();
	}
	
	@Transactional
	public List<Buffet> buffetPerCategoria(String Categoria){
		return buffetRepository.findByCategoria(Categoria);
	}

	@Transactional
	public void deleteById(Long id) {
		buffetRepository.deleteById(id);
	}
	@Transactional
	public Buffet findById(Long id) {
		return buffetRepository.findById(id).get();
	}
}


