package it.uniroma3.siw.catering.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Buffet;
import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.repository.ChefRepository;

@Service
public class ChefService {

	@Autowired
	private ChefRepository chefRepository;
	
	@Transactional
	public Chef save(Chef chef) {
		return chefRepository.save(chef);
	}
		
	@Transactional
	public List<Buffet> getChefBuffet(Chef chef){
		return chefRepository.getAllChefBuffet(chef);
	}

	@Transactional
	public List<Chef> getAllChefs(){
		return (List<Chef>) chefRepository.findAll();
	}

	@Transactional
	public void deleteById(Long id) {	
		chefRepository.deleteById(id);
	}
	
	@Transactional
	public Chef findById(Long id) {
		return chefRepository.findById(id).get();
	}
	
}
