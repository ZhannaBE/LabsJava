package lab5.example5;

public class Main {
    public static void main(String[] args) {
        Task5 a = new Task5();
        System.out.println("номер: "+a.getNum());
        a.setNum(150);
        System.out.println("номер: "+ a.getNum());
        Task5 b = new Task5();
        b.setNum(80);
        System.out.println("номер: "+ b.getNum());
    }
}
