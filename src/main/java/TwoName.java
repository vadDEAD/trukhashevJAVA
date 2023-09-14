import java.util.Scanner;

public class TwoName {
    public static void main(String args[]) {

        System.out.print("Введите имя: ");
        Scanner input = new Scanner(System.in);
        String inputCheckName = input.nextLine();
        if (inputCheckName.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}