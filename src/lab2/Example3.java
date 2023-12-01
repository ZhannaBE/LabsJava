package lab2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите любое число не меньше 10: ");
        int num1 = in.nextInt();
        if (num1 < 10) {
            System.out.println("число не подходит по условию");
        } else {
            int res = num1 / 4;
            System.out.println("делится на 4: " + res);
        }


    }
}


