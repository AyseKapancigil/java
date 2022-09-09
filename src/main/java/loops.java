public class loops {

    public static void main(String[] args){

        int sum = 0;
        for (int i = 3; i < 15; i++) {
            sum = sum+i;


        }
        System.out.println(sum);

        String result = "";

        for(char i = 'C';i>='A';i--){
            result = result+i ;


        }
        System.out.println(result);

         String s = "Mark";
         String r = "";

         for(int i=s.length()-1;i>-1;i--){
             r=r+s.substring(i,i+1);
             System.out.println(r);


         }
        System.out.println(r);

        String t = "Mark";
        StringBuilder sb= new StringBuilder(t);
        System.out.println(sb.reverse());

    }
}