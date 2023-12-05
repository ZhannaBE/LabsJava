package Lab3;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("введите любые две цифаы: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1>num2 ) {
            System.out.println(num2 + ","  + num1);
        }
        else{
            System.out.println(num1 + ","+ num2);
        }


    }
}




/*4. Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).*/