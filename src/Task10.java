import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int number = 0;
        boolean inputResult = false;
        int countEven = 0;
        int countOdd = 0;

        do {
            try {
                inputResult = true;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите натуральное число: ");
                number = scanner.nextInt();

                if (number < 1 ) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);
        for (int i = number; i > 0; i = i / 10) {
            int digit = i % 10;
            if (digit % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Четные числа: " + countEven);
        System.out.println("Нечетный числа: " + countOdd);
    }
}