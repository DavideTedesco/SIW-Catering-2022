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
	
	/*
	 * How to find all chef's buffet???
	 */
	
	//@Transactional
	//public List<Buffet> getChetBuffet(Chef c){
	//	return chefRepo.getAllChefBuffet(c);
	//}
		
	@Transactional
	public List<Buffet> getChetBuffet(Chef chef){
		return chefRepo.getAllChefBuffet(chef);
	}

}
