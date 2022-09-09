package practice07;

import java.util.Scanner;

public class Q05 {
    /*
        Take the exam point from user and print the grade on console by using switch statement according to the rules below:
          F--> (0.00 - 1.00)
          D--> (1.00 - 2.00)
          C--> (2.00 - 2.50)
          B--> (2.50 - 3.50)
          A--> (3.50 - 4.00)
          (Firsts inclusive - Seconds exclusive)
         */
    public static void main(String[] args) {

      Scanner input = new Scanner (System.in);
        System.out.println("Enter your point");
        double point = input .nextDouble();

        String grade = "";

        if(point >=0 && point<1){
            grade = "Fail";


        }else if(point>=1 && point <2){

            grade = "Pass";



        }else   grade = "Pass";
        }


        }









