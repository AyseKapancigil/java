package practicefaizan01;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {



        String user = "tech123";
        String email = "tech@gmail.com";
        String pass   = "techpro12";

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your username or Email");

        String username = scan.nextLine();

        System.out.println("Enter your password");
        String password = scan.nextLine();

        if(username.equals(user) || username.equals(email) && username.equals(pass)){

            System.out.println("Welcome you are logged in!");


        }else{

            System.out.println("Sorry please enter correct credentials");
        }


    }
}
