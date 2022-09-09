package practicefaizan01;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number : ");
         int num = scan.nextInt();

        if(num%2==0){
            System.out.println(num+  " is a even number");


        }else{
            System.out.println(num+ " is a odd number");
        }
    }
}
