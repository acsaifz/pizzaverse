package hu.acsaifz.pizzaverse.repository;

import hu.acsaifz.pizzaverse.entity.Pizzeria;
import org.springframework.data.repository.CrudRepository;

public interface PizzeriaRepository extends CrudRepository<Pizzeria,Long> {
}
