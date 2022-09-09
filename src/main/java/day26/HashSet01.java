package day26;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {

    /* set means no repeated elements ,all element are unique
    fastest ,single null,random order


     */

    public static void main(String[] args) {


      HashSet<String> hSet = new HashSet<>();

        hSet.add("A");
        hSet.add("Z");
        hSet.add("M");
        hSet.add("B");
        hSet.add("Y");
        System.out.println("First " + hSet.add("H"));
        System.out.println("Second " +hSet.add("H"));
      hSet.add(null);
      hSet.add(null);

        System.out.println(hSet);





      }


    }

