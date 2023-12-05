package Lab3;
import java.util.Random;
import java.util.Arrays;
public class example10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        // заполняем массив случайными числами
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];

            array[i] = array[array.length - i - 1];

            array[array.length - i - 1] = temp;

        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

    }

}










        /*10. Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.*/