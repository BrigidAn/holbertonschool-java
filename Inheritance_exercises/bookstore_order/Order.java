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

    // Getter
    public double getDiscountPercentage() { return discountPercentage; }
    public ItemOrder[] getItems() { return items; }
}
