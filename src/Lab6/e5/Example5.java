package Lab6.e5;

import java.util.Scanner;

public class Example5 {
    private static long calc (int n ) {
        long ret = 0;
        for (int i = 1; i <= n; i ++);{

        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите n: ");
        int n = in.nextInt();
        long res = calc(n);

        System.out.println("рузультат суммы квадратов: "+ res);

    }
}
