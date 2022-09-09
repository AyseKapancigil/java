package day04;

import java.util.Scanner;

public class Day04Scanner03 {

        /*
            Ask user to enter the width, length and the height of a rectangular prism then find the volume.
            Volume = width * length * height
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter width");
        double w = input.nextDouble();

        System.out.println("Enter the length");
        double l = input.nextDouble();

        System.out.println("Enter the height");
        double h = input.nextDouble();

        System.out.println("Volume is " + w*l*h);

    }

}

