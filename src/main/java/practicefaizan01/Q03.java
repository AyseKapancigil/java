package practicefaizan01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Enter the third number");
        int num3 = scan.nextInt();

        if (num1<num2 && num1<num3 ){

            System.out.println(num1+ " is the smallest then "+num2+ " and "+num3);



        }else if(num2<num1 && num2< num3){

            System.out.println(num2+  " is the smallest then "+ num1+ " and " +num3);

        }else{

            System.out.println(num3+ " is the smallest then "+ num1+ " and " + num2);
        }





    }
}
