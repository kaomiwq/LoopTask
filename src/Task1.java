import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        double number = scanner.nextDouble();
        System.out.println("Введите степень числа: ");
        int degree = scanner.nextInt();
        double result = 1;

        if(degree>0){
            for (int i = 0; i <= degree-1 ; i++) {
                result = result * number;
            }
            System.out.println("Результат: ");
            System.out.println(String.format("%.3f",result));
        }else {
            for (int i = 0; i >= degree+1 ; i--) {
                result = result * 1/number;
            }
            System.out.println("Результат: ");
            System.out.println(String.format("%.3f",result));
        }
    }
}