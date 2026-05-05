public class SeriesEpisode {
    private final String seriesTitle;
    private final int season;
    private final int episode;

    public SeriesEpisode(String seriesTitle, int season, int episode) {
        this.seriesTitle = seriesTitle;
        this.season = season;
        this.episode = episode;
    }

    @Override
    public String toString() {
        return String.format("Series: %s, S%02dE%02d", seriesTitle, season, episode);
    }
}