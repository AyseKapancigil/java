package practicefaizan02;

import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {
          int arr [] = {34,56,78,90};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max= arr[arr.length-1];
        System.out.println("Min = "+min);

        System.out.println("Max = "+ max);

    }
}
