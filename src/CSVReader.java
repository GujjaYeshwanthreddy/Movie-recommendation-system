import java.io.*;
import java.util.*;

public class CSVReader {

    public static List<Movie> readMovies(String filePath) {
        List<Movie> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                movies.add(new Movie(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3]
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return movies;
    }
}