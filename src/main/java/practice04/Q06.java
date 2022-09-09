package practice04;

import java.util.Arrays;

public class Q06 {

    public static void main(String[] args) {

/*
          Type code to find the minimum, maximum and second-maximum number in the array?
          input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
          output: min:-90, max:10001, secMax: 8787
         */


        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));




    }
}
