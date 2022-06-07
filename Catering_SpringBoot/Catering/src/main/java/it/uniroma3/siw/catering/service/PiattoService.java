package it.uniroma3.siw.catering.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.Piatto;
import it.uniroma3.siw.catering.repository.PiattoRepository;

@Service
public class PiattoService {
	@Autowired
	private PiattoRepository piattoRepository;

	@Transactional
	public void salvaPiatto(Piatto p) {
		piattoRepository.save(p);
	}
	
	@Transactional
	public void deletePiatto(Long id) {
		piattoRepository.deleteById(id);
	}
	
	public Piatto findById(Long id) {
		return piattoRepository.findById(id).get();
	}
	
	public List<Piatto> findAll(){
		List<Piatto> persone = new ArrayList<>();
		for(Piatto p : piattoRepository.findAll())
			persone.add(p);
		return persone;
	}
	
	public boolean alreadyExists(Piatto p) {
		//TODO
		return false;
	}
}
