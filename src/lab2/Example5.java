package lab2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите любое тысячное число  : ");
        int num1 = in.nextInt();

        int a = (num1/1000) %10;
        System.out.println("во введенном числе: " + num1 + " " + a);




    }
}
