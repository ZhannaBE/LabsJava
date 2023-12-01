package lab2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите люьое число: ");
        int num1 = in.nextInt();
        if (num1 % 5 == 2 ) {
            System.out.println("число делится на 5 с ост.2: ");
        }
        else{
            System.out.println("число не делатся на 5 с остатком 2 : ");
        }
        if (num1 % 7 == 1){
            System.out.println("число делится на 7 с ост.1: ");
        }
        else{
            System.out.println("число делится на 7 с ост.1: ");
        }

    }
}
