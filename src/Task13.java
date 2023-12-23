import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int last = number % 10;
        int first = 0;
        int result = 0;
        if (number<0) {
            while (number < -9) {
                number = number / 10;
                first = number;
            }
        }else {
            while (number > 9) {
                number = number / 10;
                first = number;
            }
        }
        result = first + last;
        System.out.println("Сумма первой и последней цифры числа: " + result);
    }
}