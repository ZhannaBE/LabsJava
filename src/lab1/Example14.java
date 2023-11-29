package lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: Введите любое  число  : ");
        int number1 = in.nextInt();

        int result1 = number1 - 1;
        System.out.println("число на еденицу меньше введенного:" + " " + result1);

        int result2 = number1 + 1;
        System.out.println("число на еденицу больше введенного" +" " + result2);

        int result3 = (result1 + result2 + number1)*(result1 + result2 + number1);
        System.out.println(result3);



    }
}