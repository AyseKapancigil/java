package practicefaizan02;

import java.util.Arrays;

public class Q07 {
    public static void main(String[] args) {


        int arr[] = {11,2,-9,47,5,486};
        int max = 0;
        int secMax = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }

        }
        for(int j=0;j<arr.length;j++)
        {
            if (arr[j] > secMax&&arr[j] != max) {

                secMax = arr[j];
            }

        }

        System.out.println(secMax);

            }

        }

