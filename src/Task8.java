import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = 0;

        while(number!= 0){
            result = number % 10;
            number = number / 10;
            System.out.print(result + " ");
        }
    }
}