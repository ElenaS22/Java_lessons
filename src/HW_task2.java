//К калькулятору из предыдущего дз добавить логирование.
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HW_task2 {
    private static final Logger logger = Logger.getLogger( HW_task2.class.getName());
    private static FileHandler fileHandler;

    static {
        try {
            // Создание и настройка FileHandler для записи логов в файл
            fileHandler = new FileHandler("calculator.log");
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Введите цифру для выбора действия: 1 - сложение; 2 - вычитание: ");
        int value = sk.nextInt();

        if (value == 1) {
            Scanner num = new Scanner(System.in);
            System.out.print("Введите первое слагаемое: ");
            int num1 = num.nextInt();
            System.out.print("Введите второе слагаемое: ");
            int num2 = num.nextInt();
            slozhenie(num1, num2);
        } else {
            Scanner num = new Scanner(System.in);
            System.out.print("Введите уменьшаемое: ");
            int num1 = num.nextInt();
            System.out.print("Введите вычитаемое: ");
            int num2 = num.nextInt();
            vichitanie(num1, num2);
        }
    }

    public static void slozhenie(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Результат сложения: " + result);
        logger.log(Level.INFO, "Сложение: {0} + {1} = {2}", new Object[]{num1, num2, result});
    }

    public static void vichitanie(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Результат вычитания: " + result);
        logger.log(Level.INFO, "Вычитание: {0} - {1} = {2}", new Object[]{num1, num2, result});
    }
}
