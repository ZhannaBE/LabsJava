package lab5.example1;

public class Task1 {
    private char ch1;

    public void seCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getCodeSymbol(){
        return ch1;
    }
    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}
/*1. Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код.*/