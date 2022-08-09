package hu.acsaifz.pizzaverse.controller;

import hu.acsaifz.pizzaverse.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PizzeriaController {
    private PizzeriaService pizzeriaService;

    @Autowired
    public void setPizzeriaService(PizzeriaService pizzeriaService) {
        this.pizzeriaService = pizzeriaService;
    }

    @GetMapping("/pizzerias")
    public String getAllPizzerias(Model model){
        model.addAttribute("pizzerias",pizzeriaService.getAll());
        return "pizzerias";
    }

    @GetMapping("/pizzerias/{id}/pizzas")
    public String getPizzasByPizzeriaId(@PathVariable long id, Model model){
        model.addAttribute("pizzeria", pizzeriaService.getById(id));
        return "pizzeria-pizzas";
    }


}
