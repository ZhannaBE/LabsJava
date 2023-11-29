package lab1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number1: Введите любое  число1  : ");
        int number1 = in.nextInt();

        System.out.println("Enter a number2: Введите любое  число2  : ");
        int number2 = in.nextInt();

        int result1 = number1 + number2;
        System.out.println("сумма числа1 и числа2:" +" " + result1);

        int result2 = number1 / number2;
        System.out.println("разность этих чисел:" + " " + result2);



    }
}
