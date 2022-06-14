package it.uniroma3.siw.catering.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.uniroma3.siw.catering.model.Ingrediente;
import it.uniroma3.siw.catering.model.User;

@Component
public class IngredienteValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Ingrediente ingrediente = (Ingrediente) o;

		if (ingrediente.getNome().isEmpty())
			errors.rejectValue("nome", "required");

		if (ingrediente.getOrigine().isEmpty())
			errors.rejectValue("origine", "required");

		if (ingrediente.getDescrizione().isEmpty())
			errors.rejectValue("descrizione", "required");
	}

}
