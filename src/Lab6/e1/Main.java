package Lab6.e1;

public class Main {
    public static void main(String[] args) {
        Example1 example1 =new Example1();

        example1.setCh1OrStr1('l');
        example1.setCh1OrStr1("привет");
        System.out.println(example1.ch1);
        System.out.println(example1.str1);

        char [] chars1 = new char[5];
        chars1[0] = 'П';
        chars1[1] = 'о';
        chars1[2] = 'к';
        chars1[3] = 'а';
        chars1[4] = '!';
        example1.setCh1OrStr1(chars1);
        System.out.println(example1.str1);

        char [] chars2 = new char[1];
        chars2[0]= 'Ц';
        System.out.println(example1.ch1);


    }
}
