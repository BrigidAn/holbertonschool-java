import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {
    private List<NotificationChannel> channels = new ArrayList<>();

    public void registerChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void process(Video video) {
        String messageText = video.getFile() + " - " + video.getFormat();
        Message message = new Message(messageText, MessageType.LOG);

        for (NotificationChannel channel : channels) {
            channel.notify(message);
        }
    }
}
