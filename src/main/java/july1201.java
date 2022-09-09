import java.util.*;

public class july1201 {

    public static void main(String[] args) {

        //How to check the number of repeated elements in a List
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();

        for (Integer w:myList){
            Integer numOfOccurunce = myMap.get(w);
            if(numOfOccurunce==null){
                myMap.put(w,1);


            }else{

                myMap.put(w,numOfOccurunce+1);
            }

        }

        System.out.println(myMap);


        Collection<Integer> myValues = myMap.values();
          int counter = 0;
        for(Integer w: myValues ){

            if(w>1){

                counter++;

            }


        }
        System.out.println("There are " + counter + " repeated elements");
    }
}
