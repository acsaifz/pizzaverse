package hu.acsaifz.pizzaverse.controller;

import hu.acsaifz.pizzaverse.service.TestDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    private TestDataLoader dataLoader;

    @Autowired
    public void setDataLoader(TestDataLoader dataLoader) {
        this.dataLoader = dataLoader;
    }

    @GetMapping("/test")
    public String testDataLoad(){
        dataLoader.loadData();
        return "redirect:/pizzerias";
    }
}
