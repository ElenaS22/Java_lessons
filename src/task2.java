<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Random;
public class task2 {
    public static void main(String[] args) {
    List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Нептун");
        planets.add("Нептун");

        System.out.println("Исходный список планет: " + planets);


        Collections.shuffle(planets, new Random());

        System.out.println("Список планет в произвольном порядке: " + planets);

    Set<String> uniquePlanets = new HashSet<>(planets);
    List<String> uniquePlanetList = new ArrayList<>(uniquePlanets);

        System.out.println("Список планет без повторений: " + uniquePlanetList);

        Collections.shuffle(uniquePlanetList);

        System.out.println("Список планет в произвольном порядке: " + uniquePlanetList);

    Map<String, Integer> planetCount = new HashMap<>();

        for (String planet : uniquePlanetList) {
        planetCount.put(planet, Collections.frequency(planets, planet));
    }

        for (String planet : uniquePlanetList) {
        int count = planetCount.get(planet);
        System.out.println("Планета: " + planet + ", Количество упоминаний: " + count);
    }
}
}
=======

//напишите метод, который сжимает строку
public class task2 {
    public static void main(String[] args) {
        String input = "aabbbbcccdw";
        String compressed = compressString(input);
        System.out.println(compressed);
    }

    public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Добавляем последний символ и его количество
        compressed.append(input.charAt(input.length() - 1)).append(count);

        return compressed.toString();
    }
}
>>>>>>> 4ccd8a2f017ab4c2300c788510fd0cd4bf8449f2
