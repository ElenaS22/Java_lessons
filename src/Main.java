import java.util.Scanner;

// дано четное число N и символы с1 и с2, написать метод, который вернет строку длины N, которая состоит из чередующихся символов  c1 b c2, начиная с с1
public class Main {
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       System.out.println("Введите четное число N");
       int N = sn.nextInt();
       System.out.println(createString(N));
    }
    public static String createString(int N) {
        StringBuilder str = new StringBuilder();
        String c1 = "c1";
        String c2 = "c2";
        for (int i = 0; i < N/2; i++) {
            str.append(c1).append(c2);
        }
        return str.toString();
    }
}