package it.uniroma3.siw.catering;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class DBslave {
	//CLASS USEFUL TO ENCRYPT PASSWORDS FOR DB MANUAL INSERTION
	@Bean
	static
	PasswordEncoder passwordEncoderProva() {
		return new BCryptPasswordEncoder();
	}

	public  String encoderDB(String passwordInChiaro) {
		System.out.println(passwordInChiaro);
		String encoded = null;
		try {
			encoded = passwordEncoderProva().encode(passwordInChiaro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(encoded);
		return encoded;
	}
}
