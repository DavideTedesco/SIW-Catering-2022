package it.uniroma3.siw.catering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
//per escludere spring security
//(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class CateringApplication {

	public static void main(String[] args) {
		DBslave dbslave = new DBslave();
		//dbslave.encoderDB("password");
		SpringApplication.run(CateringApplication.class, args);
	}

	
	 
}
