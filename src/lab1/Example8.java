package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: Введите название текущего дня недели ");
        String day = in.nextLine();

        System.out.println("Input month: Введите название месяца ");
        String month = in.nextLine();

        System.out.println("Imput date: Ввведите номер дня");
        int date = in.nextInt();


        System.out.println("Сегодня " + day + " " + date + " " + month );
    }


}
