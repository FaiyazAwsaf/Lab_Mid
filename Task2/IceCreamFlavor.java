package Task2;

public class IceCreamFlavor implements Elements {
    private final String name;
    private final double pricePerScoop;

    public IceCreamFlavor(String name, double pricePerScoop) {
        this.name = name;
        this.pricePerScoop = pricePerScoop;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return pricePerScoop;
    }
}



