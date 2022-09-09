import java.util.Scanner;

public class june22 {


    public static void main(String[] args) {

        // String[] arr = new String[] {"Apex","Apex", "is", "a"," an", "object", "oriented", "programming", "language"};

        //   Scanner scan = new Scanner (System.in);
        //  System.out.println("Enter a word");
        //  String word = scan.next();
        //  int counter=0;
        //for(String w :arr){

        // if(w.equals(word)){
        //     System.out.println("existing word:" +w);
        //     counter++;


        // System.out.println(counter);
        // if(counter ==0){

        //   System.out.println("not exist");

        // Type code to find sum of the number of characters of array element

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
         int sum = 0;
        for (String w : arr) {

            sum = sum +w.length();


        }
        System.out.println(sum);
    }
}













