package factory;

public class Americano implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.println("Americano is ready!");
    }
}
