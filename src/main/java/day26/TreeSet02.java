package day26;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {

    public static void main(String[] args) {
  int time1 = LocalTime.now().getNano();
        HashSet<Integer> hSet = new HashSet<>();

        for (int i = 1000; i > 0; i--) {
            hSet.add(i);

        }


        TreeSet<Integer> tSet = new TreeSet<>(hSet);
        int time2 = LocalTime.now().getNano();
        TreeSet<Integer> tSet2 = new TreeSet<>();
        for (int i = 1000; i > 0; i--) {
            tSet2.add(i);
        }
        int time3 = LocalTime.now().getNano();

        System.out.println("HashSet+TreeSet:"+ (time2- time1));
        System.out.println("TreeSet:"+(time3-time2));

       // tSet.add(null);
    }
}