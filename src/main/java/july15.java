import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class july15 {

    public static void main(String[] args) {
        // How to check the number of repeated elements in a List
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        HashMap<Integer,Integer> myMap = new HashMap<>();

        for (Integer w : myList) {

            if (myMap.containsKey(w)) {
              myMap.put(w, myMap.get(w)+1);

            }else{
                myMap.put(w, 1);
            }


        }
        System.out.println(myMap);
    }
}