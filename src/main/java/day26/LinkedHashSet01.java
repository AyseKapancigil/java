package day26;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {


    public static void main(String[] args) {

        LinkedHashSet<String> lhSet = new LinkedHashSet<>();
        System.out.println(lhSet.add(null));
        lhSet.add("A");
        lhSet.add("BFED");
        lhSet.add("ZK");
        lhSet.add("M");
        lhSet.add("KLMN12");
        lhSet.add("?");
       // System.out.println(lhSet.add(null));
       // System.out.println( lhSet.add(null));
        System.out.println(lhSet);


    }
}