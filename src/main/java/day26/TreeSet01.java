package day26;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("Apple");
        tSet.add("Mango");
        tSet.add("Orange");
        tSet.add("Palm");
        tSet.add("Apricot");
        tSet.add("Palm");
        //tSet.add(null); treeSet does not accept null as a element.

        System.out.println(tSet);

        TreeSet<String> sub1 = (TreeSet<String>) tSet.subSet("Apricot","Palm");
        System.out.println(sub1);

       TreeSet<String> sub2= (TreeSet<String>) tSet.subSet("Apricot",false,"Palm",true);
        System.out.println(sub2);

       String el1= tSet.ceiling("Nancy");
        System.out.println(el1);

        String el2=tSet.floor("Mango");
        System.out.println(el2);

       SortedSet<String> sub3=tSet.headSet("Orange");
        System.out.println(sub3);

        SortedSet<String> sub4= tSet.headSet("Orange",true);
        System.out.println(sub4);

        SortedSet<String> sub5=  tSet.tailSet("Mango");
        System.out.println(sub5);

        SortedSet<String> sub6= tSet.tailSet("Mango",false);
        System.out.println(sub6);



    }

}
