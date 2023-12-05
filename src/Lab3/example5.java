package Lab3;
import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите любые две цифаы: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int res1 = num1+num2;
        if (res1 % 5  == 2 ) {
            System.out.println("число делится на 5 с ост.2: ");
        }
        else{
            System.out.println("число не делатся на 5 с остатком 2 : ");
        }
        if (res1 % 3 == 1){
            System.out.println("число делится на 3 с ост.1: ");
        }
        else {
            System.out.println("число делится на 3 с ост.1: ");}
    }
}










/*5. Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-
ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.*/