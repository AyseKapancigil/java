package practice06;

import java.util.Scanner;

public class Q01 {


    public static void main(String[] args) {


      Scanner input  = new Scanner(System.in) ;
        System.out.println("Enter an integer");
        int num = input.nextInt();

        System.out.println( num%2==0 ? "Even" :num+3);




    }
}
