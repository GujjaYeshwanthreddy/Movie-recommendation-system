import java.util.*;

public class Recommender {

    public static Map<String, Double> computeTF(String text) {
        Map<String, Double> tf = new HashMap<>();
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            tf.put(word, tf.getOrDefault(word, 0.0) + 1);
        }

        for (String word : tf.keySet()) {
            tf.put(word, tf.get(word) / words.length);
        }

        return tf;
    }

    public static double cosineSimilarity(Map<String, Double> v1, Map<String, Double> v2) {
        Set<String> words = new HashSet<>(v1.keySet());
        words.addAll(v2.keySet());

        double dot = 0, mag1 = 0, mag2 = 0;

        for (String word : words) {
            double x = v1.getOrDefault(word, 0.0);
            double y = v2.getOrDefault(word, 0.0);

            dot += x * y;
            mag1 += x * x;
            mag2 += y * y;
        }

        return dot / (Math.sqrt(mag1) * Math.sqrt(mag2) + 1e-9);
    }

    public static List<Movie> recommend(Movie input, List<Movie> movies) {
        Map<String, Double> inputVec = computeTF(input.description);
        Map<Movie, Double> scores = new HashMap<>();

        for (Movie m : movies) {
            if (m.id == input.id) continue;

            Map<String, Double> vec = computeTF(m.description);
            double sim = cosineSimilarity(inputVec, vec);
            scores.put(m, sim);
        }

        return scores.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}