package Timus;

import java.io.PrintWriter;
import java.util.Scanner;
    public class T2012 {
        public static class Main {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out);

                int numofT2012 = in.nextInt();
                int difference = 12 - numofT2012;

                int time = difference * 45;
                if (time <=240){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                out.flush();
            }
        }
    }

