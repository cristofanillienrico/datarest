package it.prova.datarest;

import it.prova.datarest.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatarestApplication implements CommandLineRunner {

    @Autowired
    private HeroRepository heroRepository;

    public static void main(String[] args) {
        SpringApplication.run(DatarestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Hero cosimo = new Hero();
        cosimo.setName("Cosimo");
        heroRepository.save(cosimo);

        Hero giovanni = new Hero();
        giovanni.setName("Giovanni");
        heroRepository.save(giovanni);

        Hero giacomo = new Hero();
        giacomo.setName("Giacomo");
        heroRepository.save(giacomo);

    }
}
