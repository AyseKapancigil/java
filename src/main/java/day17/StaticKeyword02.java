package day17;

public class StaticKeyword02 {

    public static void main(String[] args) {

        System.out.println( StaticKeyword01.sCounter);

        StaticKeyword01 obj4 = new StaticKeyword01();
        System.out.println(obj4.counter);

        System.out.println( obj4.sCounter);


    }
}
