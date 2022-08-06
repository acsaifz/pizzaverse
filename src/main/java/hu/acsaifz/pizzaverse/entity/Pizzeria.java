package hu.acsaifz.pizzaverse.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pizzeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private int openHour;
    private int closeHour;
    @OneToMany(mappedBy = "pizzeria")
    private List<Pizza> pizzaList;

    public Pizzeria(){

    }

    public Pizzeria(String name, String address, int openHour, int closeHour) {
        this.name = name;
        this.address = address;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public void addPizza(Pizza pizza){
        if (pizzaList == null){
            pizzaList = new ArrayList<>();
        }
        pizzaList.add(pizza);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(int closeHour) {
        this.closeHour = closeHour;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }
}
