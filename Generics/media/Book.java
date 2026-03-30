public class Book extends Media {
    private int edition;

    public Book(String name, int edition) {
        super(name);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }
}
