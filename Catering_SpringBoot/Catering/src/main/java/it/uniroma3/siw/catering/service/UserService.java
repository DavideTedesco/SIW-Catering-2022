package it.uniroma3.siw.catering.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.catering.model.User;
import it.uniroma3.siw.catering.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	@Transactional
	public User save(User user) {
		return userRepo.save(user);
	}
	
	@Transactional
	public List<User> getAllUsers(){
		return (List<User>) userRepo.findAll();
	}
}
