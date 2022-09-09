public class loop {

    public static void main(String[] args) {

//      String s = "";
//      for(int i =  10;i < 121 ;i ++){
//          if(i%4==0 && i%6==0){
//               s=s+i+" ";
//          }
//
//        }
//
//        System.out.println(s);
//
//      String st= "";
//
//      int i = 120;
//      do{
//         if( i%4==0&& i%6==0){
//             st= st+i+" ";
//         }i--;
//
//      }while(i>10);
//        System.out.println(st);


//        // Type code to print repeated characters in a String. For example; accessories ⇒ ces
//        String str = "accessories";
//
//        String d="";
//
//        for(int j = 0; j<str.length();j++){
//
//          String c =str.substring(j,j+1);
//          if(str.indexOf(c)!= str.lastIndexOf(c)){
//              if(!d.contains(c)){
//                  d=d+c;
//
//
//              }
//
//
//          }
//
//
//        }
//
//        System.out.println(d);


        String s = "1233212";

        String d = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            String c = s.substring(i, i + 1);
            d = d + c;


        }
        if (s.equals(d)) {
            ;
            System.out.println("palindrome");

        } else {
            System.out.println("not  palindrome");

        }

    }


}






