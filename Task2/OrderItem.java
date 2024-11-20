package Task2;

class OrderItem {
    private final Elements elements;
    private final int quantity;

    public OrderItem(Elements elements, int quantity) {
        this.elements = elements;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return quantity * elements.getPrice();
    }

    public String getDescription() {
        return "Description";
    }
}
