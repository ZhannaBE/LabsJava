package Lab3;
import java.util.Random;
import java.util.Arrays;
public class example9 {
    public static void main(String[] args) {
        int [] array = new int [10];

        // заполнить массив рандомными числами
        Random random = new Random();

        for ( int i =0 ; i < array.length; i ++){
            array[i] = random.nextInt(100);
        }
        System.out.println("массив: " + Arrays.toString(array));

        int min = array [0];
        for(int i = 1; i< array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("минимальный элемент: " + min);
        System.out.println("индекс миним. эемента: " );
        for (int i = 0; i< array.length; i ++){
            if (array[i] == min ){

            }
        }


    }
}
/*9. Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.*/