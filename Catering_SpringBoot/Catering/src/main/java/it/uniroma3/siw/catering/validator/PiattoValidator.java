package it.uniroma3.siw.catering.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.uniroma3.siw.catering.model.Piatto;
import it.uniroma3.siw.catering.model.User;

@Component
public class PiattoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Piatto piatto = (Piatto) o;

		if (piatto.getNome().isEmpty())
			errors.rejectValue("nome", "required");

		if (piatto.getDescrizione().isEmpty())
			errors.rejectValue("descrizione", "required");
	}

}
