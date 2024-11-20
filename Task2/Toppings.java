package Task2;

public class Toppings implements Elements{
    private final String name;
    private final double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
