package practicefaizan02;
//duplicate values
public class Q06 {

    public static void main(String[] args) {


        int arr[] = {23,65,87,87,56,90,90,56,223};


         for(int i = 0; i<arr.length-1;i++){

             for(int k= i+1;k<arr.length;k++){

          if(arr[i]==arr[k]){
              System.out.println("duplicate number: " + arr[k]);
          }
             }



         }


    }
}
