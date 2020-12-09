package fr.content.TP4_spring.jeux.repository;

import fr.content.TP4_spring.jeux.modele.Jeu;
import org.springframework.data.repository.CrudRepository;

public interface JeuRepository extends CrudRepository<Jeu, Integer> {

    Iterable<Jeu> findByNom(String nom);

    Jeu findById(int id);

    void deleteById(int id);
}
