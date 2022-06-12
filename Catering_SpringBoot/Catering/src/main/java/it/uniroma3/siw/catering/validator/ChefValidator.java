package it.uniroma3.siw.catering.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.uniroma3.siw.catering.model.Chef;

@Component
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
