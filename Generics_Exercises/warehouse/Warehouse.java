import java.util.HashMap;
import java.util.Map;

public class Warehouse<T> implements Storable<T> {
    private Map<String, T> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    @Override
    public void addToInventory(String name, T item) {
        inventory.put(name, item);
    }

    @Override
    public T getFromInventory(String name) {
        return inventory.get(name);
    }
}
