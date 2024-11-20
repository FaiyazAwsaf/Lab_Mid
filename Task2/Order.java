package Task2;

import java.util.ArrayList;
import java.util.List;

class Order {
    private final List<OrderItem> items = new ArrayList<>();
    private Container servingContainer;
    private final ExtraChargesOrDiscunts taxCalculator;

    public Order(ExtraChargesOrDiscunts taxCalculator) {
        this.taxCalculator = taxCalculator;
        this.servingContainer = new PaperCup(); // Default serving container
    }

    public void addItem(Elements elements, int quantity) {
        items.add(new OrderItem(elements, quantity));
    }

    public void setServingContainer(Container container) {
        this.servingContainer = container;
    }

    public Container getContainer() {
        return servingContainer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double calculateBasePrice() {
        return 00;
    }

    public double calculateExtraOrDiscount() {
        return taxCalculator.reCalculatePrice(calculateBasePrice());
    }

    public double calculateTotal() {
        return calculateBasePrice() + calculateExtraOrDiscount();
    }
}
