package practicefaizan01;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  any alphabet");
        String input = scan.next().toLowerCase();


        boolean uppercase = input.charAt(0)>=65  && input.charAt(0)<=90;
        boolean lowercase = input.charAt(0)>=97  && input.charAt(0)<=122;

        boolean vowel = input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u");




    }
}
