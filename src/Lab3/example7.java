package Lab3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 10;
        char[] array = new char[size];

        char letter = 'а';

        for (int i = 0; i < size; i++) {
            array[i] = letter;
            letter += 2;
        }

        System.out.println("Прямой порядок:");
        for (char value : array) {
            System.out.print(value + " ");
        }

        System.out.println("\nОбратный порядок:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}



/*7. Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.*/