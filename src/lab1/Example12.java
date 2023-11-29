package lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("current year: Введите текущий год: ");
        int current = in.nextInt();

        System.out.println("age: Введите возраст: ");
        int age = in.nextInt();

        int result = current - age;

        System.out.println("год рождения польвателя" + " " + result);


    }

}
