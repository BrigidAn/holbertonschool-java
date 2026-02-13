import providers.ShippingProvider;

public class OrderProcessor {

    private ShippingProvider shippingProvider;

    public OrderProcessor(ShippingProvider shippingProvider) {
        this.shippingProvider = shippingProvider;
    }

    public void process(Order order) {
        order.setShipping(
            shippingProvider.calculateShipping(
                order.getWeight(),
                order.getTotal()
            )
        );
    }
}
