import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int lastDigit = 0;
        int maxNumber = 1;


        while(number!=0){
            lastDigit = number%10;
            if (lastDigit>maxNumber) {
                maxNumber = lastDigit;
            }
            number = number / 10;
        }
        System.out.println("Наибольшая цифра заданного числа: " + maxNumber);
    }
}