import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int summultiplication = 1;
        int lastDigit = 1;

        while(number>0){
            lastDigit = number%10;
            number = number/10;
            sum = sum+lastDigit;
            summultiplication = summultiplication * lastDigit;
        }
        System.out.println("Сумма и произведение цифр числа: " + sum + ", " + summultiplication);
    }
}