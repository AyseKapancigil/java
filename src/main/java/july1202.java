import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class july1202 {


    public static void main(String[] args) {

        // Type code to print different characters used in a String
      //  Example: ‘Mississippi’ = Misp

        String s = "Mississippi";
       String [] arr= s.split("");

        List<String> characters = Arrays.asList(arr);
        Set<String> mySet = new HashSet<>(characters);
        System.out.println(mySet);


       // 1) Find the middle element in an integer array
      //  Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int a []= new int[]{12, 5, 8, 13};


        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        if(a.length%2!=0){
             int indexMiddleOfElement = a.length/2;
            System.out.println(a[indexMiddleOfElement]);


        }else{
            int indexMiddleOfElement = a.length/2;
            int avarageValue =( a[indexMiddleOfElement] + a[indexMiddleOfElement-1])/2;

            System.out.println(avarageValue);


          // Find the smallest positive element and greatest negative element in an integer array
           // Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

            int[]brr = {-12, 18, -5, 23, -2};
             Arrays.sort(brr);

            System.out.println(Arrays.toString(brr));


            for(int i =0;i<brr.length;i++){

                if(brr[i]<0  && brr[i+1]>0){

                    System.out.println("max negative "+ brr[i]);

                    System.out.println("min positive "+ brr[i+1]);
                }

            }



              }

          }



        }












