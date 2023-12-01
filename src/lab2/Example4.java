package lab2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите любое число нем меньше 5 и не больше 10 : ");
        int num1 = in.nextInt();
        if (num1 < 5 || num1>10){
            System.out.println("условия не соблюдены");
        }
        else {
            System.out.println("условия соблюдены");
        }

    }
}
