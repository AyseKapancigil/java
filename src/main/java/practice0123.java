import java.util.*;

public class practice0123 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        System.out.println(myList);
        Set<Integer> mySet =new HashSet<>(myList);
        System.out.println(mySet.size());
      //  Type code to print different characters used in a String
       // Example: ‘Mississippi’ Ş Misp

        String str ="Mississippi";
        List<String>list = new ArrayList<>();
      String arr[] = str.split("");
    for(String w :arr) {
        list.add(w);


    }}}



     //  Set<String> st= new HashSet<>(list);
     // System.out.println(st);





