import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        boolean inputResult = false;
        int number = 0;
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

        int revers = 0;
        int lastDigit = 0;

        while(number>0){
            lastDigit =number % 10;
            number = number / 10;
            revers = revers * 10 + lastDigit;
        }
        System.out.println("Перевернутое число: " + revers);
    }
}