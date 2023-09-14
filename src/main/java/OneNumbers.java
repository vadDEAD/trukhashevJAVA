import java.util.Scanner;

public class OneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputCheckNumber = input.nextInt();
        if (inputCheckNumber <= 7) {
            System.out.println("Введите число больше 7");
        } else if (inputCheckNumber > 7) {
            System.out.println("Привет");
        }
    }
}