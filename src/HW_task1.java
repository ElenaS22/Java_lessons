///Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HW_task1 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        String logFilePath = "sort_log.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFilePath))) {
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                // Записываем текущее состояние массива в лог-файл
                writeArrayToLog(writer, array);
                if (!swapped) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeArrayToLog(BufferedWriter writer, int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            writer.write(array[i] + " ");
        }
        writer.newLine();
    }
}

