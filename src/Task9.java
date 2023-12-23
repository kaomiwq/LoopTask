import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int number = 0;
        boolean inputResult = false;
        int sum = 0;
        int lastDigit = 0;

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
        while(number != 0){
            lastDigit = number%10;
            number = number/10;
            if (lastDigit%2==0){
                sum = sum + lastDigit;
            }
        }
        System.out.println("Сумма четных цифр: " + sum);
    }
}