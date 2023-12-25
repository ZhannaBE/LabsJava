package lab5.example2;

public class Task2 {
    private char ch1, ch2;
    public void  Setch1(char ch1){this.ch1= ch2;}

    public void Set2ch2(char ch2){this.ch2=ch2;}

    public  void showCharArray(){
        int int1 = ch1;
        int int2 = ch2;

        if ( ch1>ch2){
            int1 = ch2;
            int2 = ch1;
        }
        int b =1;
        for (int i =int1; i <=int2; i++){
            System.out.println(b+ "Symbol= "+(char)i);
            i++;
        }
    }



}



/*2. Напишите программу с классом, у которого есть два символьных поля и
        метод. Он возвращает результат, и у него нет аргументов. При вызове метод
        выводит в консольное окно все символы из кодовой таблицы, которые
        находятся «между» символами, являющимися значениями полей объекта (из
        которого вызывается метод). Например, если полям объекта присвоены
        значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
        выводиться все символы от ‘A’ до ‘D’ включительно.*/
