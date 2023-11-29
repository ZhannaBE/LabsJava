package lab1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("year of birth: Введите год вашего рождения: ");
        int year  = in.nextInt();

        System.out.println("current year: Введите текущий год: ");
        int current = in.nextInt();

        int result = current - year;
        System.out.print( result + " возраст пользователя" );
    }
}
