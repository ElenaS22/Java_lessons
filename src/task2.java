
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
