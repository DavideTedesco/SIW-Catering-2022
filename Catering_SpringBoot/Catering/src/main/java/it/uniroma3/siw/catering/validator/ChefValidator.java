package it.uniroma3.siw.catering.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.uniroma3.siw.catering.model.Chef;
import it.uniroma3.siw.catering.model.User;

@Component
public class ChefValidator implements Validator {
	
	@Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

	@Override
	public void validate(Object o, Errors errors) {
		 Chef chef = (Chef) o;
	        String nome = chef.getNome().trim();
	        String cognome = chef.getCognome().trim();
	        String nazionalita = chef.getNazionalita().trim();

	        if (nome.isEmpty())
	            errors.rejectValue("nome", "required");

	        if (cognome.isEmpty())
	            errors.rejectValue("cognome", "required");
	        
	        if (nazionalita.isEmpty())
	            errors.rejectValue("nazionalita", "required");
	}

}
