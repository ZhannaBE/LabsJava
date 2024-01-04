package Lab6.e2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол-во вызовов статистического метода: ");
        int numOfInvocation = scanner.nextInt();
        scanner.close();
        for (int i= 0; i <numOfInvocation; i ++){
            Counet.incrementAndDisplay();
        }
    }
class Counet{
        private Counet(){}
    public static void incrementAndDisplay(){
            System.out.println();
    }
}







}
/*2. Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.*/