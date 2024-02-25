package Bekzat_Ashirbay_220103091;

import java.util.ArrayList;
import java.util.List;

    public class PizzaStore {
        List<Customer> customers;
        List<Pizza> pizzas;
        String storeLocation;
        String storeName;
        int storeId;

        public PizzaStore(List<Customer> customers, List<Pizza> pizzas,
                          String storeLocation, String storeName, int storeId) {
            this.customers = customers;
            this.pizzas = pizzas;
            this.storeLocation = storeLocation;
            this.storeName = storeName;
            this.storeId = storeId;
        }
        public PizzaStore() {
            this.pizzas = new ArrayList<>();
        }

        public List<Pizza> getAllPizza() {
            return pizzas;
        }

        public void setAllPizza(List<Pizza> pizzas) {
            this.pizzas = pizzas;
        }

        public Pizza addNewPizza(Pizza pizza) {
            pizzas.add(pizza);
            return pizza;
        }

        public void deletePizza(Pizza pizza) {
            pizzas.remove(pizza);
        }
    }