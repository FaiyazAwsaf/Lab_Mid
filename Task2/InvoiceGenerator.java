package Task2;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;

class TextFileInvoiceGenerator{
    public <FileWriter> void generateInvoice(Order order) throws IOException {
        String fileName = "Invoice-" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Ice Cream Shop Invoice\n");
            for (OrderItem item : order.getItems()) {
                writer.write(item.getDescription() + ": $" + String.format("%.2f", item.calculatePrice()) + "\n");
            }
            writer.write(String.format("Serving Container: %s - $%.2f\n",
                    order.getServingContainer().getName(),
                    order.getServingContainer().getPrice()));
            writer.write(String.format("Subtotal: $%.2f\n", order.calculateSubtotal()));
            writer.write(String.format("Tax: $%.2f\n", order.calculateTax()));
            writer.write(String.format("Total Amount Due: $%.2f\n", order.calculateTotal()));
        }
    }
}