package practice01;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Scanner scan=  new Scanner (System.in);
        System.out.println("Enter first integer");
        int a=scan.nextInt();
        System.out.println("Enter second integer");
        int b= scan.nextInt();

        System.out.println(a==b  ? "They are equal"  : a>b ?   "maximum Value : "+a:  "maximum value: "+b);




    }
}
