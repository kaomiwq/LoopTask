import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите факториал: ");
        int result = 1;
        int factorial = scanner.nextInt();

        for (int i = 1; i < factorial+1; i++) {
            result = result * i;
        }
        System.out.println("!" + factorial + " = " + result);
    }
}