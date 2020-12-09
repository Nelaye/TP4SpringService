package fr.content.TP4_spring.jeux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

@Component
public class InitBD implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Creation et init de la BDD");

        String[] sqlStatements = {
                "DROP TABLE jeu if exists",
                "CREATE TABLE jeu(id serial, nom varchar(255), plateforme varchar(255))",
                "INSERT INTO jeu (nom, plateforme) VALUES('Fallout16', 'ps4') ;",
                "INSERT INTO jeu (nom, plateforme) VALUES('Tomb Raider', 'xbox1') ;",
                "INSERT INTO jeu (nom, plateforme) VALUES('Mario', 'switch') ;"
        };

        Arrays.stream(sqlStatements).forEach(sql -> {
            System.out.println(sql);
            jdbcTemplate.execute(sql);
        });

        System.out.println("============= Affichage de tous les jeux ===========");
        jdbcTemplate.query("SELECT * FROM jeu",
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet jeu, int i) throws SQLException {
                        System.out.println("id"+jeu.getString("id")+
                                " nom: "+jeu.getString("nom")+
                                " plateforme: "+jeu.getString("plateforme"));
                        return null;
                    }
                });

    }
}
