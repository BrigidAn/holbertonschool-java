public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    public Order(double discountPercentage, ItemOrder[] items) {
        this.discountPercentage = discountPercentage;
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (ItemOrder item : items) {
            total += item.getQuantity() * item.getProduct().getNetPrice();
        }
        total = total * (1 - discountPercentage / 100.0);
        return total;
    }

    public void presentOrderSummary() {
        System.out.println("------- ORDER SUMMARY -------");

        double totalProducts = 0.0;

        for (ItemOrder item : items) {
            products.Products product = item.getProduct();
            int quantity = item.getQuantity();
            double netPrice = product.getNetPrice();
            double totalLine = netPrice * quantity;
            totalProducts += totalLine;

            String type = product instanceof products.Book ? "Book" : "Dvd";
            System.out.printf("Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f\n",
                    type, product.getTitle(), netPrice, quantity, totalLine);
        }

        double discountAmount = totalProducts * (discountPercentage / 100.0);
        double totalOrder = totalProducts - discountAmount;

        System.out.println("----------------------------");
        System.out.printf("DISCOUNT: %.2f\n", discountAmount);
        System.out.printf("TOTAL PRODUCTS: %.2f\n", totalProducts);
        System.out.println("----------------------------");
        System.out.printf("TOTAL ORDER: %.2f\n", totalOrder);
        System.out.println("----------------------------");
    }

    // Getters
    public double getDiscountPercentage() { return discountPercentage; }
    public ItemOrder[] getItems() { return items; }
}

