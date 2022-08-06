package hu.acsaifz.pizzaverse.service;

import hu.acsaifz.pizzaverse.entity.Pizzeria;
import hu.acsaifz.pizzaverse.repository.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzeriaService {
    private PizzeriaRepository pizzeriaRepository;

    @Autowired
    public void setPizzeriaRepository(PizzeriaRepository pizzeriaRepository) {
        this.pizzeriaRepository = pizzeriaRepository;
    }

    public List<Pizzeria> getAll(){
        return new ArrayList<>((List<Pizzeria>)pizzeriaRepository.findAll());
    }
}
