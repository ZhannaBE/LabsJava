package Lab4;
import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.println("введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] ArrayZmey = new int[a][b];
        int hvost = 0;
        int telo = 0;
        int h = 0;
        for (int i = 0; h < ArrayZmey.length ; h++) {
            for (int j = 0; j <(ArrayZmey[i].length - hvost); j++) {
                ArrayZmey[i][j] = telo;
                telo++;
            }
            if(i< ArrayZmey.length-1) {
                i++;}
            for (int o=a-1; o > hvost; o--) {
                ArrayZmey[o][ArrayZmey[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < ArrayZmey.length; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < ArrayZmey[i].length; j++){
                System.out.print(ArrayZmey[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}



