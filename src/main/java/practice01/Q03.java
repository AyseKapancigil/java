package practice01;

public class Q03 {


    public static void main(String[] args) {

        int x=12345;
        int ones = x %10;
        int tens = (x /10)%10;
        int hundreds = (x/100)%10;
        int thousand = (x/1000)%10;
        int tenthousand= x/10000;

        System.out.println(tenthousand+"\n"+thousand+"\n"+hundreds+"\n"+tens+"\n"+ones+"\n");






    }


}
