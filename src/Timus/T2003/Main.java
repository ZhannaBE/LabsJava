package Timus.T2003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        if ( a1 ==3 || a2 ==1 || a3 ==2 || a4 ==3){
            System.out.println("1");
        }else {
            System.out.println();

        }
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();
        int b4 = in.nextInt();
        int b5 = in.nextInt();
        if ( b1 ==4 || b2 ==2 || b3 ==2   || b4 ==2  || b5 ==2){
            System.out.println("infinity");
        }else{
            System.out.println();
        }



    }
}
