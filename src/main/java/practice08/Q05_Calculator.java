package practice08;

public class Q05_Calculator {
    /*
    Create a basic calculator, create add, subtract, multiply, divide methods.
     */

   public void add(double...a){
   int sum = 0;
       for(double w : a){
          sum+=w;

       }
       System.out.println(sum);


   }


   public void substract(double a,double b){

       System.out.println("The difference is" +(a-b));


   }

   public void multiply(double... a){
   double product = 1;
       for(double w :a){
          product*=w;

       }

       System.out.println(product);



   }

    public void divide(double a ,double b){



    }


}
