package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Tom Hanks", 13);
        hMap.put("Brad Pitt", 24);
        hMap.put("Angelina Joly", 46);
        hMap.put("Cuneyt Arkin", 85);
        hMap.put("Alex Alex", 33);

        System.out.println(hMap);


        Set<String> keys = hMap.keySet();


        int totalNumOfLetters = 0;
        for (String w : keys) {
            totalNumOfLetters = totalNumOfLetters + w.replaceAll("[^a-zA-Z]", "").length();


        }
        System.out.println(totalNumOfLetters);

        Collection<Integer> values = hMap.values();
        int sum = 0;

        for (Integer w : values) {
            sum = sum + w;


        }
        int avg = sum / values.size();
        System.out.println(avg);

       Integer age1= hMap.get("Cuneyt Arkin");
        System.out.println(age1);

        Set<String> keys2= hMap.keySet();
        System.out.println(keys2);

      Collection<Integer> values2=  hMap.values();
        System.out.println(values2);

       Integer age4 =  hMap.getOrDefault("Angelina Joly",0);

        System.out.println(age4);
        hMap.putIfAbsent("Angelina Julie ",32);
        System.out.println(hMap);

       Set<Map.Entry<String,Integer>>entries =  hMap.entrySet();
        System.out.println(entries);

 boolean exist1  = hMap.containsKey("Alexx");
        System.out.println(exist1);

        hMap.replace("Cuneyt Arkin",54,99);
        System.out.println(hMap);
        hMap.replace("Alex Alex",44);
        System.out.println(hMap);









    }

}