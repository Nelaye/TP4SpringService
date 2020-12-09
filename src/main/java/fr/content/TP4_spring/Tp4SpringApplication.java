package fr.content.TP4_spring;

import fr.content.TP4_spring.jeux.modele.Jeu;
import fr.content.TP4_spring.jeux.repository.JeuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class Tp4SpringApplication {

	//private static final Logger log = LoggerFactory.getLogger(Tp4SpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Tp4SpringApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner demo(JeuRepository repository){
		return (args) -> {
			repository.save(new Jeu(1,"fallout", "ps4"));
			repository.save(new Jeu(1,"ratchet", "xbox"));
			repository.save(new Jeu(1,"tomb raider", "switch"));

			log.info("Affichage de tous les jeux -------(findAll)----------");
			for(Jeu j : repository.findAll()){
				log.info(j.toString());
			}

			log.info("Affichage de un jeu -------(findById(2))----------");
			Jeu x = repository.findById(2);
			log.info(x.toString());

			log.info("Affichage du jeu -------(findByNom('ratchet'))----------");
			repository.findByNom("ratchet").forEach(y ->{
				log.info(y.toString());
			} );

		};
	}*/

}
