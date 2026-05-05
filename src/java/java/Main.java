public class Main {
    public static void main(String[] args) {
        MediaLibrary<Movie> movies = new MediaLibrary<>();
        movies.add(new Movie("Inception", "Christopher Nolan", 2010));
        movies.add(new Movie("The Matrix", "Wachowskis", 1999));

        System.out.println("Movies list:");
        for (Movie m : movies) {
            System.out.println("- " + m);
        }

        MediaLibrary<Podcast> podcasts = new MediaLibrary<>();
        podcasts.add(new Podcast("Tech Talk", "John Doe"));

        System.out.println("\nPodcasts count: " + podcasts.size());
        System.out.println("First podcast: " + podcasts.get(0));

        movies.remove(0);
        System.out.println("\nMovies after removal:");
        for (Movie m : movies) {
            System.out.println("- " + m);
        }
    }
}