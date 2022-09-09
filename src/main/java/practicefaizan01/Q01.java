package practicefaizan01;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        double num = scan.nextDouble();

        if(num >=0){

            System.out.println(num+ " is a positive number");

        }else{
            System.out.println(num+ " is a negative number");
        }

    }
}
