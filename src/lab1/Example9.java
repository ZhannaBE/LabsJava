package lab1;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Input day: Введите колличество дней в этом месяце: ");
        int day = in.nextInt();

        System.out.println(month + " "  + "содержит" + " "  +  day + " "+"дней");

    }

}
