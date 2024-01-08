package Timus.T1639;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        int res = (m * n) % 2;
        out.println((res!=0 )?("[second]=:]") : ("[:=[first]"));
        out.flush();
    }
}
