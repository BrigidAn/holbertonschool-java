public class ItemOrder {
    private products.Products product;
    private int quantity;

    public ItemOrder(products.Products product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public products.Products getProduct() { return product; }
    public int getQuantity() { return quantity; }
}
