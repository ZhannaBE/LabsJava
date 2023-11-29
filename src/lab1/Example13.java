package lab1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number1: Введите любое  число 1 : ");
        int number1 = in.nextInt();

        System.out.println("Enter a number2: Введите любое число 2 : ");
        int number2 = in.nextInt();

        int result = number1 + number2;

        System.out.println("сумма двух чисел =" + result);



    }
}
