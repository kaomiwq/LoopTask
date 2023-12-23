import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите колличество элементов в ряду чисел Фибоначчи: ");
        int n = scanner.nextInt();

        System.out.println("Ряд чисел Фибоначчи из " + n + " элементов: ");
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}