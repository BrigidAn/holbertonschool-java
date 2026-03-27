import java.util.*;

public class CookieOrder {
    private String flavor;
    private int boxQuantity;

    // Constructor
    public CookieOrder(String flavor, int boxQuantity) {
        this.flavor = flavor;
        this.boxQuantity = boxQuantity;
    }

    // Getter for flavor
    public String getFlavor() {
        return flavor;
    }

    // Getter for box quantity
    public int getBoxQuantity() {
        return boxQuantity;
    }
}
