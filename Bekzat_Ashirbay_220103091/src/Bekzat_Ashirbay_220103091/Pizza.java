 package Bekzat_Ashirbay_220103091;

    public class Pizza {
        private int pizzaId;
        private String title;
        private double price;
        private String size;
        private Topping topping;
        private PizzaBase pizzaBase;

        public Pizza(int pizzaId, String title, double price, String size, PizzaBase pizzaBase) {
            this.pizzaId = pizzaId;
            this.title = title;
            this.price = price;
            this.size = size;
            this.pizzaBase = pizzaBase;
        }

        public Pizza(int pizzaId, String title, double price,
                     String size, Topping topping, PizzaBase pizzaBase) {
            this.pizzaId = pizzaId;
            this.title = title;
            this.price = price;
            this.size = size;
            this.topping = topping;
            this.pizzaBase = pizzaBase;
        }

        public int getPizzaId() {
            return pizzaId;
        }

        public void setPizzaId(int pizzaId) {
            this.pizzaId = pizzaId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public Topping getTopping() {
            return topping;
        }

        public void setTopping(Topping topping) {
            this.topping = topping;
        }

        public PizzaBase getPizzaBase() {
            return pizzaBase;
        }

        public void setPizzaBase(PizzaBase pizzaBase) {
            this.pizzaBase = pizzaBase;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "pizzaId=" + pizzaId +
                    ", title='" + title + '\'' +
                    ", price=" + price +
                    ", size='" + size + '\'' +
                    ", topping=" + topping +
                    ", pizzaBase=" + pizzaBase +
                    '}';
        }
    }

