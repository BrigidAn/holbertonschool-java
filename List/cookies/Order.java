import java.util.*;

public class Order {
    private ArrayList<CookieOrder> cookies;

    // Constructor
    public Order() {
        cookies = new ArrayList<>();
    }

    // Add a cookie order
    public void addCookieOrder(CookieOrder order) {
        cookies.add(order);
    }

    // Get total boxes
    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : cookies) {
            total += order.getBoxQuantity();
        }
        return total;
    }

    // Remove all orders of a specific flavor
    public int removeFlavor(String flavor) {
        int removedBoxes = 0;

        Iterator<CookieOrder> iterator = cookies.iterator();

        while (iterator.hasNext()) {
            CookieOrder order = iterator.next();

            if (order.getFlavor().equals(flavor)) {
                removedBoxes += order.getBoxQuantity();
                iterator.remove(); // SAFE removal
            }
        }

        return removedBoxes;
    }
}
