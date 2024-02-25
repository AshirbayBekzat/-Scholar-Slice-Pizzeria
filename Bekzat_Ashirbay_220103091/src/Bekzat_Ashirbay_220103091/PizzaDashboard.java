package Bekzat_Ashirbay_220103091;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaDashboard {

        static Scanner scanner = new Scanner(System.in);
        static PizzaStore pizzaStore = new PizzaStore();
        static PizzaService pizzaService = new PizzaService(pizzaStore);
        static List<Order> orderList = new ArrayList<>();
        static int orderCounter = 0;
        static int customerCounter = 0;
        static  List<Pizza> selectedPizzaList = new ArrayList<>();


        public static void main(String[] args) {
            Topping hotSouse = new Topping("Hot Souse","Hot","his souse only for who love hot souses");
            Topping cheese = new Topping("Cheese souse","very low","This Souse for extra cheese");
            Topping sweetChile = new Topping("Sweet Chile","low","This souse make your pizza more tasty");
            Topping ketchup = new Topping("Ketchup","medium","Ket");
            Topping tomato = new Topping("Tomato","Low","Universal souse for many pizza types");
            Topping bbq = new Topping("BBQ","Medium","Souse for pizzas with meat");
            Topping white = new Topping("White Souse","Low","Universal souse for pizzas");


            PizzaBase vegetarian = new PizzaBase("Vegetarian","vegetarian","Without any kind of meet");
            PizzaBase artificialMeat = new PizzaBase("artificialMeat","artificialMeat","With artificialMeat");
            PizzaBase diet = new PizzaBase("diet","diet","This type pizzas for who hold a diet");
            PizzaBase classic = new PizzaBase("Classic","Classical","Classic pizza");
            PizzaBase WholeWheatDough = new PizzaBase("Whole wheat dough","Whole wheat dough","Is a type of pizza crust " +
                    "or dough made from whole wheat flour");

            Pizza pizza18 = new Pizza(7,"Tegamino",7.9,"Big",diet);
            Pizza pizza19 = new Pizza(8,"Tegamino",7.9,"Medium",diet);
            Pizza pizza20 = new Pizza(9,"Tegamino",7.9,"Small",diet);

            Pizza pizza21 = new Pizza(10,"Montanara",7.9,"Big",ketchup,diet);
            Pizza pizza22 = new Pizza(11,"Montanara",7.9,"Medium",ketchup,diet);
            Pizza pizza23 = new Pizza(12,"Montanara",7.9,"Small",ketchup,diet);

            pizzaService.addNewPizza(pizza18);
            pizzaService.addNewPizza(pizza19);
            pizzaService.addNewPizza(pizza20);
            pizzaService.addNewPizza(pizza21);
            pizzaService.addNewPizza(pizza22);
            pizzaService.addNewPizza(pizza23);



            boolean exit = false;

            while (!exit) {
                System.out.println("Choose your Role to Login");
                System.out.println("1 for Admin role");
                System.out.println("2 for Customer role");
                System.out.println("0 for exit");
                System.out.print("Enter your choice: ");
                int roleChoice = scanner.nextInt();
                System.out.println();

                switch (roleChoice) {
                    case 0:
                        System.out.println("Goodbye");
                        exit = true;
                        break;
                    case 1:
                        adminRole();
                        break;
                    case 2:
                        customerRole();
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again...");
                }

            }
            scanner.close();
        }


        static void adminRole() {
            boolean isValidChoice = false;
            while (!isValidChoice) {
                System.out.println("You are in Admin role. Choose are action");
                System.out.println("1 Add New Pizza");
                System.out.println("2 Update Pizza");
                System.out.println("3 Delete Pizza");
                System.out.println("4 View All Pizza");
                System.out.println("5 Search Pizza");
                System.out.println("0 for exit");
                System.out.print("Choose one action: ");
                int AdminAction = scanner.nextInt();

                switch (AdminAction){
                    case 0:
                        isValidChoice = true;
                        System.out.println("You are exit from admin role ");
                        break;
                    case 1:
                        System.out.println("<=> Adding new pizza <=> ");
                        System.out.println("Enter pizza details:");

                        System.out.print("Enter ID of pizza ");
                        int idOfPizza = scanner.nextInt();
                        scanner.nextLine(); // Очищаем буфер ввода

                        System.out.print("Enter title of pizza ");
                        String titlePizza = scanner.nextLine();

                        System.out.print("Enter price of pizza ");
                        double priceOfPizza = scanner.nextDouble();
                        scanner.nextLine(); // Очищаем буфер ввода

                        System.out.print("Enter size of pizza ");
                        String sizeOfPizza = scanner.nextLine();

                        System.out.print("Enter title of topping ");
                        String toppingTitle = scanner.nextLine();

                        System.out.print("Enter hot level of topping ");
                        String hotLevel = scanner.nextLine();
                        System.out.println();

                        System.out.print("Enter description of topping ");
                        String descriptionOFTopping = scanner.nextLine();
                        System.out.println();

                        System.out.print("Enter title of base type ");
                        String baseTitle = scanner.nextLine();

                        System.out.print("Enter base type ");
                        String baseType = scanner.nextLine();

                        System.out.print("Enter description for base ");
                        String descriptionBase = scanner.nextLine();


                        PizzaBase pizzaBase = new PizzaBase(baseTitle,baseType,descriptionBase);
                        Topping topping1 = new Topping(toppingTitle,hotLevel,descriptionOFTopping);
                        Pizza newPizza = new Pizza(idOfPizza,titlePizza,priceOfPizza,sizeOfPizza,topping1,pizzaBase);
                        pizzaService.addNewPizza(newPizza);
                        System.out.println("New pizza successfully added ty menu");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Update pizza");
                        List<Pizza> pizzas = pizzaService.getAllPizza();
                        for(Pizza p :pizzas ){
                            System.out.println("Pizza title "+p.getTitle()+" pizza ID: "+p.getPizzaId()+" price: "+p.getPrice());
                        }
                        System.out.print("Choose pizza id");
                        int chooseID = scanner.nextInt();
                        try{
                            Pizza pizzaToUpdate = pizzaService.getPizzaById(chooseID);
                            System.out.print("Enter new price for "+pizzaToUpdate.getTitle()+":");
                            double newPrice  = scanner.nextDouble();
                            pizzaToUpdate.setPrice(newPrice);
                        }catch (PizzaNotFoundMessage e){
                            System.out.println("Pizza not found");
                        }
                        break;
                    case 3:
                        List<Pizza> pizzas14 = pizzaService.getAllPizza();
                        for(Pizza p :pizzas14){
                            System.out.println("Pizza title "+p.getTitle()+" pizza ID: "+p.getPizzaId()+" price: "+p.getPrice());
                        }
                        System.out.print("Choose pizza id");
                        int chooseIDForDelete = scanner.nextInt();
                        try{
                            Pizza pizzaToDelete = pizzaService.getPizzaById(chooseIDForDelete);
                            pizzaService.deletePizza(pizzaToDelete);
                            System.out.println("Succsesfylly delete pizza from menu");
                        }catch (PizzaNotFoundMessage p){
                            System.out.println("Pizza not found");
                        }
                        break;
                    case 4:
                        List<Pizza> pizzas1 = pizzaService.getAllPizza();
                        for(Pizza p :pizzas1 ){
                            System.out.println("Pizza title "+p.getTitle()+" pizza ID: "+p.getPizzaId()+" price: "+p.getPrice());
                        }
                        break;
                    case 5:
                        System.out.println("1 for search pizza by id");
                        System.out.println("2 for search pizza by title");
                        System.out.println("3 for search pizza by size");
                        System.out.print("Enter search way: ");
                        int searchWay = scanner.nextInt();
                        switch (searchWay){
                            case 1:
                                System.out.print("Enter Id of pizza ");
                                int pizzaID = scanner.nextInt();
                                try{
                                    Pizza pizzaByID = pizzaService.getPizzaById(pizzaID);
                                    System.out.println("Pizza title "+pizzaByID.getTitle()+" Price: "+pizzaByID.getPrice());
                                }
                                catch (PizzaNotFoundMessage p){
                                    System.out.println("Pizza not found");
                                }
                                break;
                            case 2:
                                System.out.print("Enter title of pizza ");
                                String pizzaTitle = scanner.next();
                                try {
                                    Pizza pizzaByTitle = pizzaService.getPizzaByName(pizzaTitle);
                                    System.out.println("Pizza title "+pizzaByTitle.getTitle()+" "+pizzaByTitle.getPrice());
                                }catch (PizzaNotFoundMessage e){
                                    System.out.println("Pizza not found");
                                }
                                break;
                            case 3:
                                System.out.println("Enter size which you want" );
                                String pizzaSize = scanner.next();
                                try {
                                    List<Pizza> pizzaBySize = pizzaService.getPizzaBySize(pizzaSize);
                                    for(Pizza p : pizzaBySize){
                                        System.out.println(p.getPizzaId()+" "+p.getTitle()+" "+p.getPrice());
                                    }
                                }
                                catch (PizzaNotFoundMessage p){
                                    System.out.println("Pizza not found");
                                }
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again...");
                }
            }
        }


        static void customerRole() {

            boolean isValidChoice = false;
            while (!isValidChoice) {
                System.out.println("You are in Customer role choose are action");
                System.out.println("1 Place order");
                System.out.println("2 Pay bill");
                System.out.println("3 View all pizza");
                System.out.println("4 View order history");
                System.out.println("5 Search pizza");
                System.out.print("Choose one action: ");

                int customerAction = scanner.nextInt();
                switch (customerAction) {
                    case 0:
                        isValidChoice = true;
                        break;
                    case 1:
                        System.out.println("Choose pizza");
                        List<Pizza> pizzas = pizzaService.getAllPizza();
                        for (Pizza p : pizzas) {
                            System.out.println("Pizza title " + p.getTitle() + " pizza ID: " + p.getPizzaId() + " price: " + p.getPrice());
                        }
                        int selectedPizzaId = scanner.nextInt();
                        Pizza selectedPizza = null;
                        try {
                            selectedPizza = pizzaService.getPizzaById(selectedPizzaId);
                        } catch (PizzaNotFoundMessage e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("Enter your Name ");
                        String customerName = scanner.next();
                        System.out.println("You are our new customer your id will be 1");
                        customerCounter++;
                        System.out.print("Enter your phone number: ");
                        long customerPhone = scanner.nextLong();
                        System.out.print("Enter your email: ");
                        String email = scanner.next();
                        System.out.println("Enter state");
                        String state = scanner.next();
                        System.out.println("Enter your district");
                        String district = scanner.next();
                        System.out.println("Enter your city");
                        String city = scanner.next();
                        System.out.println("door");
                        int doorNUmber = scanner.nextInt();
                        selectedPizzaList.add(selectedPizza);
                        orderCounter++;
                        Address address = new Address(customerName, customerCounter, customerPhone, email, state, district, city, doorNUmber);
                        Order order = new Order(selectedPizzaList, orderCounter, LocalDate.now().toString(), selectedPizza.getPrice(), city);
                        orderList.add(order);
                        Customer customer = new Customer(customerName, customerCounter, customerPhone, email, orderList, address);
                        break;
                    case 2:
                        for(Pizza p : selectedPizzaList){
                            System.out.println("to pay"+p.getPrice());
                            double priceToPay = scanner.nextDouble();
                            if(priceToPay<p.getPrice()){
                                double stillPay = p.getPrice()-priceToPay;
                                System.out.println("not enough yet "+stillPay);
                            }
                            else if(priceToPay>p.getPrice()){
                                double change = priceToPay-p.getPrice();
                                System.out.println("Thank you here your change "+change);
                            }
                            else {
                                System.out.println("invoice paid successfully");
                            }
                        }
                        break;
                    case 3:
                        List<Pizza> pizzas1 = pizzaService.getAllPizza();
                        for (Pizza p : pizzas1) {
                            System.out.println("Pizza title " + p.getTitle() + " pizza ID: " + p.getPizzaId() + " price: " + p.getPrice());
                        }
                        break;
                    case 4:
                        for (Order order1 : orderList){
                            System.out.println("Order ID: "+order1.orderId+" Order date: "+order1.orderDate+" order description: "+order1.orderDescription);
                        }
                        break;
                    case 5:
                        System.out.println("1 for search pizza by id");
                        System.out.println("2 for search pizza by title");
                        System.out.println("3 for search pizza by size");
                        System.out.print("Enter search way: ");
                        int searchWay = scanner.nextInt();
                        switch (searchWay) {
                            case 1:
                                System.out.print("Enter Id of pizza");
                                int pizzaID = scanner.nextInt();
                                try {
                                    Pizza pizzaByID = pizzaService.getPizzaById(pizzaID);
                                    System.out.println("Pizza title " + pizzaByID.getTitle() + " " + pizzaByID.getPrice());
                                } catch (PizzaNotFoundMessage p) {
                                    System.out.println("Pizza not found");
                                }
                                break;
                            case 2:
                                System.out.print("Enter title of pizza");
                                String pizzaTitle = scanner.next();
                                try {
                                    Pizza pizzaByTitle = pizzaService.getPizzaByName(pizzaTitle);
                                    System.out.println("Pizza title " + pizzaByTitle.getTitle() + " " + pizzaByTitle.getPrice());
                                }catch (PizzaNotFoundMessage p){
                                    System.out.println("Pizza not found");
                                }

                                break;
                            case 3:
                                System.out.println("Enter size which you want");
                                String pizzaSize = scanner.next();
                                try {
                                    List<Pizza> pizzaBySize = pizzaService.getPizzaBySize(pizzaSize);
                                    for (Pizza p : pizzaBySize) {
                                        System.out.println(p.getPizzaId() + " " + p.getTitle() + " " + p.getPrice());
                                    }
                                } catch (PizzaNotFoundMessage p) {
                                    System.out.println("Pizza not found");
                                }
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again...");
                        }
                }
            }
        }
    }
