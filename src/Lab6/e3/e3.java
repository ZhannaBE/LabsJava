package Lab6.e3;

public class e3 {
    private static int i;

    public static void main(String[] args) {
        int []arr = {5,10,3,8,12};
        System.out.println("маx значение: " + maxValue(arr));
        System.out.println("min значение: "+ minValue (arr));
        System.out.println("среднее значение: "+averageValue(arr));
    }
    private static int maxValue(int... args){
        if (args.length==0){
            return 0;
        }
        int max = args[0];
        for (int i=1;i< args.length;i++){
            if (max < args[i]){
                max =args[i];
            }
        }
        return max;
    }
    private static int minValue (int ... args){
        if (args.length == 0){
            return Integer.MAX_VALUE;
        }
        int min = args[0];
        for (int i = 1; i< args.length; i++);{
            if (min > args[i]){
                min = args[i];
            }
        }
        return min;
    }
    private static double averageValue (int []arr){
        double sum = 0 ;
        for (int num: arr){
            sum+= num;
        }
        return sum / arr.length;
    }

}

/*3. Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.*/