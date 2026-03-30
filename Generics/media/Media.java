public class Media {
    private String name;

    public Media(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Type: %s - Name: %s", this.getClass().getSimpleName(), getName());
    }
}
