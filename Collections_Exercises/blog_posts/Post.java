import java.util.Objects;

public class Post implements Comparable<Post> {
    private Author author;
    private String title;
    private String body;
    private Categories category;

    public Post(Author author, String title, String body, Categories category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Categories getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Post)) return false;
        Post other = (Post) obj;
        return author.equals(other.author) && title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public int compareTo(Post other) {
        return title.compareTo(other.title);
    }
}
