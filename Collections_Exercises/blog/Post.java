public class Post {
    private String author;
    private String title;
    private String body;
    private String category;

    public Post(String author, String title, String body, String category) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.category = category;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getCategory() {
        return category;
    }

    // Optional: toString for easy printing
    @Override
    public String toString() {
        return "Post{" +
               "author='" + author + '\'' +
               ", title='" + title + '\'' +
               ", category='" + category + '\'' +
               '}';
    }
}
