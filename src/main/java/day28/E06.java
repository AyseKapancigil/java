package day28;

public class E06 {
    public static void main(String[] args) {


        Object obj = 70;
        convertObjectToString(obj);

    }
    public static void convertObjectToString(Object obj){


        try {
            String s = (String)obj;
        } catch (ClassCastException e) {
            System.out.println("Object class cannot be converted to String Class");



        }finally{
            System.out.println("Break the connection");
        }



    }
}
