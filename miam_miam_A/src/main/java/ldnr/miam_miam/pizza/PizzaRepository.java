package ldnr.miam_miam.pizza;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.chacha.beaba.tables.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long>{

}
