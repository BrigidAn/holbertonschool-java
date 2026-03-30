import java.util.Objects;

public class Author implements Comparable<Author> {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author other = (Author) obj;
        return name.equals(other.name) && surname.equals(other.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public int compareTo(Author other) {
        int surnameCmp = surname.compareTo(other.surname);
        if (surnameCmp != 0) return surnameCmp;
        return name.compareTo(other.name);
    }
}
