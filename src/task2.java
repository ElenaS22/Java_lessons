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