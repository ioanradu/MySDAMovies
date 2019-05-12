public class Main {
    public static void main(String[] args) {
        String moviesPath = "movies.txt";
        MyMoviesCollection myMoviesCollection = new MyMoviesCollection();
        myMoviesCollection.readMoviesFromFile(moviesPath);
        myMoviesCollection.showMovies();
        System.out.println();

        myMoviesCollection.sortMoviesByYear();
        myMoviesCollection.showMovies();
        System.out.println();

        myMoviesCollection.sortMoviesByScore();
        myMoviesCollection.showMovies();
        System.out.println();

        myMoviesCollection.sortMoviesByDuration();
        myMoviesCollection.showMovies();

    }
}
