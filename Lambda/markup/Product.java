import java.util.function.Supplier;
import java.util.function.Consumer;

public class Product {
    private String name;
    private double price;
    private double markupPercentage = 10.0;

    public Supplier<Double> priceWithMarkup;
    public Consumer<Double> updateMarkup;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;

        // Supplier to calculate price with markup
        this.priceWithMarkup = () -> price + (price * markupPercentage / 100);

        // Consumer to update markup percentage
        this.updateMarkup = (newMarkup) -> this.markupPercentage = newMarkup;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
