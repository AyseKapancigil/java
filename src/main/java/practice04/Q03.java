
package practice04;

public class Q03 {
    public static void main(String[] args) {

        int arr[] = { 7, 9, 4, 23, 34, };

        //Print just last two elements  (Use 'continue')

        for(int i=0;i<arr.length;i++){
            if(i<arr.length-2){
                continue;
            }
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        //Print just first three elements (Use 'break')
        for(int i=0;i<arr.length;i++){

            if(i==3){
                break;
            }

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Print the elements from index 2 to index 4 (Use 'continue' and 'break')
        for(int i =0; i<arr.length;i++){
            if(i<2){
                continue;
            }
            if(i>4){
                break;
            }
            System.out.print(arr[i]+" ");

        }

    }
}

