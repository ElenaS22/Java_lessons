import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Генерация случайного числа от 0 до 99
            numbers.add(randomNumber);
        }
        System.out.println("Исходный список случайных чисел: " + numbers);

        Collections.sort(numbers);

        System.out.println("Отсортированный список: " + numbers);
    }
}