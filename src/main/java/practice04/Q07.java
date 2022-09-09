package practice04;

public class Q07 {


    public static void main(String[] args) {


//Type code to print the elements of an array those are greater than average.
        //Type code to print the elements of an array those are greater than average.
        //int[] arr={5, 9, 15, 1, 0, 11, 3};  output:  output:



        int[] arr={5, 9, 15, 1, 0, 11, 3};

        int sum = 0;

        for(int w :arr){

            sum+=w;

        }

     int avarage = sum/arr.length;
        System.out.println("Avarage:"+avarage);



        for( int w:arr){

            if(w>avarage){

                System.out.println(w);
            }

        }


    }
}
