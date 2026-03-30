public interface Storable<T> {
    void addToInventory(String name, T item);
    T getFromInventory(String name);
}
