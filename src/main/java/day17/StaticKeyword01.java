package day17;

public class StaticKeyword01 {


    public static int sCounter = 0;
    public int counter = 0;


    public  StaticKeyword01(){

        sCounter++;
        counter++;

    }

    public static void main(String[] args) {

   StaticKeyword01  obj1 = new StaticKeyword01();

   StaticKeyword01  obj2 = new StaticKeyword01();

   StaticKeyword01  obj3 = new StaticKeyword01();

        System.out.println(sCounter);

        System.out.println(obj1.counter);

        System.out.println(obj2.counter);

        System.out.println(obj3.counter);

    }
}
