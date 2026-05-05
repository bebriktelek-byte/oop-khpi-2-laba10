public class Podcast {
    private final String title;
    private final String host;

    public Podcast(String title, String host) {
        this.title = title;
        this.host = host;
    }

    @Override
    public String toString() {
        return String.format("Podcast: %s by %s", title, host);
    }
}