import java.util.Arrays;
import java.util.Scanner;

public class june23 {


    public static void main(String[] args) {


        int[] arr = {5, 0, 2, 0, 3};
        int[] brr = new int[arr.length];
        int i = 0;
        for (int w : arr) {

            if (w != 0) {
                brr[i] = w;

                i++;

            }

        }
        System.out.println(Arrays.toString(brr));

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter number");
        // int a = input.nextInt();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string");
        String str = scan.next();
        System.out.println("Enter second string");
        String str1 = scan.next();
        String crr[] = str.split("");
        String drr[] = str.split("");
        Arrays.sort(crr);
        Arrays.sort(drr);


        if (Arrays.equals(crr, drr)) {
            System.out.println("string is anagram");
        }else{
            System.out.println("not anagram");
        }






    }


    }





