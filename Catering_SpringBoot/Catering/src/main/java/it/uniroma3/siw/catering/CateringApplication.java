package it.uniroma3.siw.catering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//per escludere spring security
//(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class CateringApplication {

	public static void main(String[] args) {
		//da scommentare se si utilizza la classe DBslave
		//DBslave dbslave = new DBslave();
		// dbslave.encoderDB("password");
		SpringApplication.run(CateringApplication.class, args);
	}

}
