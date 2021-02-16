package soccer.com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import soccer.com.example.demo.entity.Entities;
import soccer.com.example.demo.repository.PlayerRepo;

@SpringBootApplication
public class SoccerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoccerApplication.class, args);
	}

	 @Bean
	    public CommandLineRunner soccer(PlayerRepo repo) {
	        return (args) -> {
	            repo.save(new Entities(01L, "Alexis", "Chile", 31, 4, 5));
	            repo.save(new Entities(02L, "Romelu", "Belgium", 27, 12, 3));
	            repo.save(new Entities(03L, "Vidal", "Chile", 31, 6, 5));
	            repo.save(new Entities(04L, "Sensi", "Italy", 25, 2, 1));

	        };
	    }

}
