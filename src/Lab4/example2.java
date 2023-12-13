package Lab4;

public class example2 {
    public static void main(String[] args) {
        int r = 10;
        int c = 10;
        int i = 0;
        while (i < r) {
            int j = 0;
            while (j < c) {
                if (j<=i){
                    System.out.print("+");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}