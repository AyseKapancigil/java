public class june21 {

    public static void main(String[] args) {

       int num = 12345;
       String s = String.valueOf(num);

       String r = "";
        System.out.println(s);

        for(int i= s.length()-1; i >=0; i--){

            r = r+s.charAt(i);


        }
        System.out.println(r);


       }


    }

