import java.util.Scanner;

public class ThreeArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числовой массив: ");
        int size = in.nextInt();
        if (size <= 0) {
            System.out.println("Введено недопустимое значение");
        } else {
            int[] arr = new int[size];
            System.out.println("Введите числовые элементы массива: ");
            for (int i = 0; i < arr.length; i++)
                arr[i] = in.nextInt();
            System.out.println("Числа кратные 3: ");
            for (int i = 0; i < arr.length; i++) {
                int a = arr[i] % 3;
                if (a == 0)
                    System.out.print(arr[i] + " ");
            }
        }
    }
}