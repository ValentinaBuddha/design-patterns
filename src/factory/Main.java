package factory;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.createCoffee("espresso");
        if (espresso != null) {
            espresso.makeCoffee();
        } else {
            System.out.println("Invalid coffee type!");
        }

        Coffee americano = coffeeFactory.createCoffee("americano");
        if (americano != null) {
            americano.makeCoffee();
        } else {
            System.out.println("Invalid coffee type!");
        }
    }
}
