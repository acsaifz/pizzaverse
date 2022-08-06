package hu.acsaifz.pizzaverse.service;

import hu.acsaifz.pizzaverse.entity.Pizza;
import hu.acsaifz.pizzaverse.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {
    private PizzaRepository pizzaRepository;

    @Autowired
    public void setPizzaRepository(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> getAll(){
        return new ArrayList<>((List<Pizza>)pizzaRepository.findAll());
    }
}
