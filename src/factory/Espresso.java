package factory;

public class Espresso implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Espresso is ready!");
    }
}
