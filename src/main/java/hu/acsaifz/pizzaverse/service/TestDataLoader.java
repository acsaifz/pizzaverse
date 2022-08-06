package hu.acsaifz.pizzaverse.service;

import hu.acsaifz.pizzaverse.entity.Pizza;
import hu.acsaifz.pizzaverse.entity.PizzaSize;
import hu.acsaifz.pizzaverse.entity.Pizzeria;
import hu.acsaifz.pizzaverse.repository.PizzaRepository;
import hu.acsaifz.pizzaverse.repository.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TestDataLoader {
    private PizzeriaRepository pizzeriaRepository;
    private PizzaRepository pizzaRepository;

    @Autowired
    public void setPizzeriaRepository(PizzeriaRepository pizzeriaRepository) {
        this.pizzeriaRepository = pizzeriaRepository;
    }

    @Autowired
    public void setPizzaRepository(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void loadData() {
        Pizzeria p1 = new Pizzeria("Pizza Kalap", "Budapest", 8,22);
        Pizzeria p2 = new Pizzeria("Don Pipihusi", "Szolnok", 12,22);
        Pizzeria p3 = new Pizzeria("Pi-zza", "Debrecen", 12,20);

        Pizza pizza1 = new Pizza("Szerelő álom","Szegecs, Fém reszelék, Csavarlazító, Gépzsír, WD-40", PizzaSize.NORMAL,9.99,p1);
        Pizza pizza2 = new Pizza("Kívánság","Sajt, Hagyma, Olivabogyó, Jalapeno, Sonka, Tarja, Szalámi", PizzaSize.NORMAL,9.99,p2);
        Pizza pizza3 = new Pizza("Húsimádó","Sajt, Tarja, Sonka, Bacon, Csirke", PizzaSize.NORMAL,9.99,p1);
        Pizza pizza4 = new Pizza("Hawaii","Sajt, Kukorica, Sonka, Ananász", PizzaSize.NORMAL,9.99,p3);
        Pizza pizza5 = new Pizza("Skywalker Lajos","Kutyámajom, Centrifuga, Sinter", PizzaSize.NORMAL,9.99,p3);

        p1.addPizza(pizza1);
        p1.addPizza(pizza3);
        p2.addPizza(pizza2);
        p3.addPizza(pizza4);
        p3.addPizza(pizza5);

        pizzeriaRepository.saveAll(Arrays.asList(p1,p2,p3));
        pizzaRepository.saveAll(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
    }
}
