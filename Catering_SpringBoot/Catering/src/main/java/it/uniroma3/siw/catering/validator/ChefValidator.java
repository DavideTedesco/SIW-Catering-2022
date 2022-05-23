package it.uniroma3.siw.catering.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.uniroma3.siw.catering.model.Chef;

public class ChefValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Chef.class.equals(clazz);
	}


	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

	}

}
