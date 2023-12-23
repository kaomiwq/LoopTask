import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        boolean inputResult = false;
        int result = 0;

        do {
            try {
                inputResult = true;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите значение A: ");
                a = scanner.nextInt();

                if (a < 1 || a > 100) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);
        do {
            try {
                inputResult = true;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите значение B: ");
                b = scanner.nextInt();

                if (b <= a || b > 100) {
                    throw new Exception();
                }

            } catch (Exception e) {
                inputResult = false;

                System.out.println("Ошибка при вводе пожалуйста повторите ввод");
            }
        } while (!inputResult);

        while (a<=b){
            result = a*a*a;
            System.out.println(a + " в кубе " + "= " + result);
            a++;
        }
    }
}