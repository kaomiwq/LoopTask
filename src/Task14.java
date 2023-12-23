import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int number = 0;
        boolean inputResult = false;
        do {
            try {
                inputResult = true;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите положительное число: ");
                number = scanner.nextInt();

                if (number < 1 ) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);
        int last = number % 10;
        int first = 0;
        int result = 0;
        while(number>9){
            number = number/10;
            first = number;
        }
        result = first + last;
        System.out.println("Сумма первой и последней цифры числа: " + result);
    }
}