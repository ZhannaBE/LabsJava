package lab5.example6;

public class Main {
    public static void main(String[] args) {
        Task6 test1 = new Task6(1,2);
        System.out.println("с двумя аргументами: min: "+ test1.getMin()+"max: "+ test1.getMax());

        Task6 test2 = new Task6(2,1);
        System.out.println("с двумя аргументами: min: "+ test2.getMin()+"max: "+ test2.getMax());

        Task6 test3 = new Task6(244);
        System.out.println("с одним аргументом: min: "+ test3.getMin()+"max: "+ test3.getMax());
        int a,b,c;
        c =6;
        Task6 task6 = new Task6(c);
        task6.MinMax(c);

        a=5;
        b=2;
        Task6 test4 = new Task6(a,b);
        test4.setMin(a);
        test4.getMax();
        test4  .MinMax(a,b);
    }
}
