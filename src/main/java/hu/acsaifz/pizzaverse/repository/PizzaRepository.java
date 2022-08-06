package hu.acsaifz.pizzaverse.repository;

import hu.acsaifz.pizzaverse.entity.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza,Long> {
}
