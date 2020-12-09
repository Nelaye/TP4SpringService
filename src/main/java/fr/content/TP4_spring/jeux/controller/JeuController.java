package fr.content.TP4_spring.jeux.controller;

import fr.content.TP4_spring.jeux.modele.Jeu;
import fr.content.TP4_spring.jeux.repository.JeuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JeuController {

    @Autowired
    private JeuRepository dao;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${me}")
    private String me;

    @GetMapping(value="/Jeux")
    public Iterable<Jeu> getLesJeux(){
        return dao.findAll();
    }

    @GetMapping(value="/Jeux/{id}")
    public Jeu getJeu(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value="Jeux")
    public void addJeu(@RequestBody Jeu j){
        dao.save(j);
    }

    @DeleteMapping(value="/Jeux/{id}")
    public void supprimerJeu(@PathVariable int id){
        dao.deleteById(id);
    }

    @GetMapping(value="/Cestqui")
    public String getName(){
        return me;
    }

}
