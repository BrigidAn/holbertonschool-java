public class Electronic {
    private String description;
    private double value;

    public Electronic(String description, double value) {
        this.description = description;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("[%s] $ %.6f", description, value);
    }
}
