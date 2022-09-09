package practicefaizan03;


import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcbc";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to encrypt");
        String str3 = scan.nextLine().toLowerCase();

        for (int i = 0; i < str3.length(); i++) {
            for (int j = 0; j < 26; j++) {

                if (str3.charAt(i) == str1.charAt(j)) {
                    System.out.print(str2.charAt(j));
                }

//
//                    Scanner scan = new Scanner(System.in);
//                    System.out.println("Enter the String to encrypt");
//
//                    String str = scan.nextLine().toLowerCase();
//                    for(int i=0; i<str.length(); i++){
//                        int index = 'z' - str.charAt(i);
//                        System.out.print((char)(('a') + index));
//                    }


            }

        }

    }


}