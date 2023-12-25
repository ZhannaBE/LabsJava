package lab5.example6;

public class Task6 {
    private int min, max;

    public Task6(int min, int max) {
        if ( max >= min){
            this.max = max;
            this.min = min;
        }
    }
    public Task6( int min){
        this.max = min;
        this.min = max;
    }
    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }
    public void MinMax(int min, int max){
        this.min = Math.min(max,min);
        this.max = Math.max(max,min);
        System.out.println("два аргумента: min " + this.min+ "max: "+ this.max);
    }
    public void MinMax(int min) {
        this.min = min;
        this.max = min;
        System.out.println("один аргумент: min " + min + "max: " + max);
    }
    public int getMin(){
        return min;
    }
    public int getMax(){
        return  max;
    }



}




/*6. Напишите программу с классом, в котором есть два закрытых
целочисленных поля (назовем их max и min). Значение поля max не может
быть меньше значения поля min. Значения полям присваиваются с помощью
открытого метода. Метод может вызываться с одним или двумя
целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения
аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта.*/
