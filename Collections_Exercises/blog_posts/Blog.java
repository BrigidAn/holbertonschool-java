import java.util.*;

public class Blog {
    private Set<Post> posts;

    public Blog() {
        posts = new HashSet<>();
    }

    public void addPost(Post post) throws Exception {
        if (posts.contains(post)) {
            throw new Exception("Post already exists");
        }
        posts.add(post);
    }

    public Set<Author> getAllAuthors() {
        Set<Author> authors = new TreeSet<>();
        for (Post post : posts) {
            authors.add(post.getAuthor());
        }
        return authors;
    }

    public Map<Categories, Integer> getCountByCategory() {
        Map<Categories, Integer> count = new HashMap<>();
        for (Post post : posts) {
            count.put(post.getCategory(), count.getOrDefault(post.getCategory(), 0) + 1);
        }
        return count;
    }

    public Set<Post> getPostsByAuthor(Author author) {
        Set<Post> result = new TreeSet<>();
        for (Post post : posts) {
            if (post.getAuthor().equals(author)) {
                result.add(post);
            }
        }
        return result;
    }

    public Set<Post> getPostsByCategory(Categories category) {
        Set<Post> result = new TreeSet<>();
        for (Post post : posts) {
            if (post.getCategory() == category) {
                result.add(post);
            }
        }
        return result;
    }

    public Map<Categories, Set<Post>> getAllPostsByCategories() {
        Map<Categories, Set<Post>> map = new HashMap<>();
        for (Categories cat : Categories.values()) {
            map.put(cat, getPostsByCategory(cat));
        }
        return map;
    }

    public Map<Author, Set<Post>> getAllPostsByAuthor() {
        Map<Author, Set<Post>> map = new TreeMap<>();
        for (Author author : getAllAuthors()) {
            map.put(author, getPostsByAuthor(author));
        }
        return map;
    }
}
