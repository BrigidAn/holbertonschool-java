package providers;

public class UnitedParcelService implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {
        double cost;

        if (weight > 2000) { // 2kg
            cost = value * 0.07;
        } else {
            cost = value * 0.045;
        }

        return new Shipping(cost, ShippingProviderType.UPS);
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}
