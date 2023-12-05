package Lab3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class example8 {
    public static void main(String[] args) {
        char[] array = new char[10];
        char letter = 'A';

        for (int i = 0; i < 10; i++){
            if (letter == 'A' || letter == 'E' || letter == 'I' ||letter == 'O' || letter == 'U'){
                letter++;
            }
            array[i] = letter;
            letter ++;
        }
        for (char value : array){
            System.out.println(value + " ");
        }
    }
}





/*8. Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , 1 Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.*/
