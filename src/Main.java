import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Movie> movies = CSVReader.readMovies("data/movies.csv");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String inputTitle = sc.nextLine();

        Movie inputMovie = null;

        for (Movie m : movies) {
            if (m.title.equalsIgnoreCase(inputTitle)) {
                inputMovie = m;
                break;
            }
        }

        if (inputMovie == null) {
            System.out.println("Movie not found!");
            return;
        }

        List<Movie> recommendations = Recommender.recommend(inputMovie, movies);

        System.out.println("\nRecommended Movies:");
        for (Movie m : recommendations) {
            System.out.println("- " + m.title);
        }
    }
}