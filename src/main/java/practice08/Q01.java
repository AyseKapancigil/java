package practice08;

import org.w3c.dom.ls.LSOutput;

public class Q01 {
/*
        Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         */

    public static void main(String[] args) {

        method(1,5,5,4);



    }
    public static  void method(int a , int...numbers){
        int sum = 0  ;

        for(int w:numbers){
             sum+=w;

        }

        int result = a * sum;

        System.out.println(result);
    }




}
