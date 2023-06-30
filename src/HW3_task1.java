import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**Пусть дан произвольный список целых чисел.

 1) Нужно удалить из него чётные числа
 2) Найти минимальное значение
 3) Найти максимальное значение
 4) Найти среднее значение
 */
public class HW3_task1 {
           public static void main(String[] args) {
            // Произвольный список целых чисел
            List<Integer> numbers = new ArrayList<>();

               Random random = new Random();
               for (int i = 0; i < 10; i++) {
                   int randomNumber = random.nextInt(100); // Генерация случайного числа от 0 до 99
                   numbers.add(randomNumber);
               }
               System.out.println("Исходный список случайных чисел: " + numbers);

            // 1) Удаление чётных чисел
            numbers.removeIf(n -> n % 2 == 0);

            // 2) Нахождение минимального значения
            int min = Integer.MAX_VALUE;
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }

            // 3) Нахождение максимального значения
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }

            // 4) Нахождение среднего значения
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();

            System.out.println("Список после удаления чётных чисел: " + numbers);
            System.out.println("Минимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Среднее значение: " + average);
        }
    }

