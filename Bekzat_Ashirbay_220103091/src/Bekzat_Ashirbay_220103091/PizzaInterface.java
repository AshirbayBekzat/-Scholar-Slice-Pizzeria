package Bekzat_Ashirbay_220103091;

import java.util.List;

    public interface PizzaInterface {
        List<Pizza> getPizzaBySize(String size) throws PizzaNotFoundMessage;

        Pizza getPizzaById(int pizzaId) throws PizzaNotFoundMessage;

        Pizza getPizzaByName(String pizzaName) throws  PizzaNotFoundMessage;

        Pizza orderNewPizza(Pizza pizza, Customer customer);

        List<Pizza> getAllPizza();

        Pizza updatePrice(Pizza pizza, double newPrice);

        void deletePizza(Pizza pizza);

        Pizza addNewPizza(Pizza pizza);
    }
