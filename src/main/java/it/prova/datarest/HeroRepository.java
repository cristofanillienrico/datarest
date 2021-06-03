package it.prova.datarest;



import it.prova.datarest.model.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface HeroRepository extends CrudRepository<Hero, Long> {

    List<Hero> findByName(String name);


}
