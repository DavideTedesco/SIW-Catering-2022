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
	private ChefRepository chefRepo;
	
	@Transactional
	public Chef save(Chef chef) {
		return chefRepo.save(chef);
	}
		
	@Transactional
	public List<Buffet> getChefBuffet(Chef chef){
		return chefRepo.getAllChefBuffet(chef);
	}

	@Transactional
	public List<Chef> getAllChefs(){
		return (List<Chef>) chefRepo.findAll();
	}
}
