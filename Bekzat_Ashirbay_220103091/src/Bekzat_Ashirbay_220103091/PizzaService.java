package Bekzat_Ashirbay_220103091;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class PizzaService implements PizzaInterface {
        static Scanner scanner = new Scanner(System.in);
        private String pizzaNotFoundMessage;
        private PizzaStore pizzaStore;

        public PizzaService(PizzaStore pizzaStore) {
            this.pizzaStore = pizzaStore;
            this.pizzaNotFoundMessage = "Pizza not found";
        }

        @Override
        public List<Pizza> getPizzaBySize(String size) throws PizzaNotFoundMessage {
            List<Pizza> pizzas = pizzaStore.getAllPizza();
            List<Pizza> result = new ArrayList<>();
            for (Pizza pizza : pizzas) {
                if (pizza.getSize().equalsIgnoreCase(size)) {
                    result.add(pizza);
                    return result;
                }
            }

            throw new PizzaNotFoundMessage("Not found");
        }

        @Override
        public Pizza getPizzaById(int pizzaId) throws PizzaNotFoundMessage {
            List<Pizza> pizzas = pizzaStore.getAllPizza();
            for (Pizza pizza : pizzas) {
                if (pizza.getPizzaId() == pizzaId) {
                    return pizza;
                }
            }
            throw new PizzaNotFoundMessage("Not found");
        }

        @Override
        public Pizza getPizzaByName(String pizzaName) throws PizzaNotFoundMessage{
            List<Pizza> pizzas = pizzaStore.getAllPizza();
            for (Pizza pizza : pizzas) {
                if (pizza.getTitle().equalsIgnoreCase(pizzaName)) {
                    return pizza;
                }
            }
            throw  new PizzaNotFoundMessage("Not found");
        }

        @Override
        public Pizza orderNewPizza(Pizza pizza, Customer customer) {
            return null;
        }

        @Override
        public List<Pizza> getAllPizza() {
            return pizzaStore.getAllPizza();
        }

        @Override
        public Pizza updatePrice(Pizza pizza, double newPrice) {
            pizza.setPrice(newPrice);
            return pizza;
        }

        @Override
        public void deletePizza(Pizza pizza) {
            pizzaStore.deletePizza(pizza);
        }

        @Override
        public Pizza addNewPizza(Pizza pizza) {
            return pizzaStore.addNewPizza(pizza);
        }
    }
