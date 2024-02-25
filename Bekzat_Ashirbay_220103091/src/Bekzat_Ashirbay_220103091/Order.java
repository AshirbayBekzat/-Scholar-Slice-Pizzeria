 package Bekzat_Ashirbay_220103091;

import java.util.List;

    public class Order {
        List<Pizza> pizzas;
        int orderId;
        String orderDate;
        double payableBillAmount;
        String orderDescription;

        public Order(List<Pizza> pizzas, int orderId, String orderDate,
                     double payableBillAmount, String orderDescription) {
            this.pizzas = pizzas;
            this.orderId = orderId;
            this.orderDate = orderDate;
            this.payableBillAmount = payableBillAmount;
            this.orderDescription = orderDescription;
        }

        public List<Pizza> getPizzas() {
            return pizzas;
        }

        public void setPizzas(List<Pizza> pizzas) {
            this.pizzas = pizzas;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public double getPayableBillAmount() {
            return payableBillAmount;
        }

        public void setPayableBillAmount(double payableBillAmount) {
            this.payableBillAmount = payableBillAmount;
        }

        public String getOrderDescription() {
            return orderDescription;
        }

        public void setOrderDescription(String orderDescription) {
            this.orderDescription = orderDescription;
        }
        @Override
        public String toString() {
            return "Order{" +
                    "pizzas=" + pizzas +
                    ", orderId=" + orderId +
                    ", orderDate='" + orderDate + '\'' +
                    ", payableBillAmount=" + payableBillAmount +
                    ", orderDescription='" + orderDescription + '\'' +
                    '}';
        }
    }


