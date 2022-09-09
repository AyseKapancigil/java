package practice03;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is perfect number or not");
        int num = scan.nextInt();
        int sum = 0;
         for(int i = 1; i<num;  i++){

             if (num%i==0){

                 sum = sum+i;


             }

             }


         if(sum==num){

             System.out.println(num+" Perfect Number");


         }else{

             System.out.println(num+ " is not a perfect number");

         }
    }
}
