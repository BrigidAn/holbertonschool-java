import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    // Add a post
    public void addPost(Post post) {
        posts.add(post);
    }

    // Get all authors sorted by name
    public Set<String> getAllAuthors() {
        Set<String> authors = new TreeSet<>();
        for (Post p : posts) {
            authors.add(p.getAuthor());
        }
        return authors;
    }

    // Get count of posts by category, sorted by category name
    public Map<String, Integer> getCountByCategory() {
        Map<String, Integer> count = new TreeMap<>();
        for (Post p : posts) {
            count.put(p.getCategory(), count.getOrDefault(p.getCategory(), 0) + 1);
        }
        return count;
    }
}
