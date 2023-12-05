package Lab3;
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите любое число не больше 7 и не меньше 0: ");
        int i = in.nextInt();

        if(i<=7 || i>0 ){
            switch (i){
                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                case 6:
                    System.out.println("суббота");
                    break;
                case 7:
                    System.out.println("воскресенье");
                    break; }
        }
        else {
            System.out.println("введено некорректоне значение");
        }

    }
}


//1. Напишите программу, в которой пользователь вводит целое число
//в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//Если введенное пользователем число выходит за допустимый диапазон,
//выводится сообщение о том, что введено некорректное значение. Используйте
//оператор выбора switch.