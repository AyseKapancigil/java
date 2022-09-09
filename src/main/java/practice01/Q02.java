package practice01;

import java.util.Scanner;

public class Q02 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int x= scan.nextInt();

        if(x<0){
            System.out.println("negative Number");

        }else{if(x<10){
            System.out.println("Positive Digit");


        }else {
            System.out.println(" Positive Number");
        }


        }




      }
    }


