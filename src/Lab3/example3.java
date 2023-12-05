package Lab3;
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число последовательности: ");
        int a = in.nextInt();

        int first = 1;
        int second = 1;
        int next;

        System.out.println("Последовательность чисел Фибоначчи: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= a; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

    }
}



/*Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается по-
следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.*/