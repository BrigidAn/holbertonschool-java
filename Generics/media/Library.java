import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> mediaList;

    public Library() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public List<T> getMediaList() {
        return mediaList;
    }
}
