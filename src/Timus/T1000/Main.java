package Timus.T1000;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int res = a + b;
        if ( res ==6){
            System.out.println("результат: "+ res);
        }else {
            System.out.println();
        }
    }
}
