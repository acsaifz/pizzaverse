package hu.acsaifz.pizzaverse.controller;

import hu.acsaifz.pizzaverse.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {
    private PizzaService pizzaService;

    @Autowired
    public void setPizzaService(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/pizzas")
    public String getAllPizzas(Model model){
        model.addAttribute("pizzas",pizzaService.getAll());
        return "pizzas";
    }
}
