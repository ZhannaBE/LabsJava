package lab2;
import java.io.PrintWriter;
import java.util.Scanner;
public class timus2_1409 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int numberofCans = a + b - 1;

        int Garri = numberofCans - a;
        int Larri = numberofCans - b;


        out.println(Garri + " " + Larri);
        out.flush();

    }



}