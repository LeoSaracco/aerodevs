package ar.com.cdt.aerodevs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AerodevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AerodevsApplication.class, args);
	}
}