package hu.acsaifz.pizzaverse.entity;

import javax.persistence.*;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String toppings;
    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;
    private double price;
    @ManyToOne
    private Pizzeria pizzeria;

    public Pizza(){

    }

    public Pizza(String name, String toppings, PizzaSize pizzaSize, double price) {
        this.name = name;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
        this.price = price;
    }

    public Pizza(String name, String toppings, PizzaSize pizzaSize, double price, Pizzeria pizzeria) {
        this.name = name;
        this.toppings = toppings;
        this.pizzaSize = pizzaSize;
        this.price = price;
        this.pizzeria = pizzeria;
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

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizzeria getPizzeria() {
        return pizzeria;
    }

    public void setPizzeria(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }
}
