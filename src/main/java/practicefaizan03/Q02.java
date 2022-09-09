package practicefaizan03;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
         String arr[]= {"j","a","v","a","i","s","e","a","s","y"};
        System.out.println(Arrays.toString(arr));

        String str= "";
        for(String w:arr){

            str= str+w;
        }
        System.out.println(str);
        String strFinal = str.replace("is","isnot");
        System.out.println(strFinal);

    }
}
