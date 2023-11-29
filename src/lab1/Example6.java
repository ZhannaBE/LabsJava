package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("Введите фамилию");
        Scanner in  = new Scanner (System.in);
        String firstName = in.nextLine();

        System.out.println("Введите имя");
        String secName = in.nextLine();

        System.out.println("Введите отчество");
        String thName = in.nextLine();

        System.out.println("Привет! " + firstName + " " + secName + " " + thName);
    }
}

