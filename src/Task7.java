import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int number = 0;
        boolean inputResult = false;
        int result = 1;

        do {
            try {
                inputResult = true;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите число от 20 до 30: ");
                number = scanner.nextInt();

                if (number < 20 || number > 30) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);
        do {
            if (number%2==0){
                number = number/2;
            }else {
                number = (number*3+1)/2;
            }
        }while(result!=number);
        System.out.println("Итоговое значение числа после использования гипотезы Сиракуза: ");
        System.out.println(number);
    }
}