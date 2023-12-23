import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предел: ");
        int N = scanner.nextInt();
        int numbers = 1;
        int square = 0;

        do {
            System.out.print(square + " ");
            numbers++;
            square = numbers*numbers;
        }while(square<=N);
    }
}