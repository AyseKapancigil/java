import java.util.*;

public class july07 {


    // Type code to print the common elements between a Set and a List
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

             mySet.retainAll(myList);

                    System.out.println(mySet);

        //type code to print the different elements in a Set from a List
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);
        Set<Integer> mySet1 = new HashSet<>();
        mySet1.add(10);
        mySet1.add(7);
        mySet1.add(35);
        mySet1.add(13);


        mySet1.removeAll(myList1);

        System.out.println(mySet1);


        //Type code to check if a List has repeated elements or not
        List<Integer> myList3 = new ArrayList<>();
        myList3.add(10);
        myList3.add(31);
        myList3.add(15);
        myList3.add(7);
        myList3.add(13);


        Set<Integer>set3= new HashSet<>(myList3);
        if(set3.size()==myList3.size()){

            System.out.println("no Repeated elements");

        }else if (myList3 .size()> set3.size()){

            System.out.println("repeated elements exist");


            //here is a Map which contains product names as key and number of the products as value.
                   // Type code to find the total number of products.

         HashMap<String, Integer> hMap1 = new HashMap<>();
            hMap1.put("Laptop", 12);
            hMap1.put("Music System", 87);
            System.out.println(hMap1);

          // Integer totalValue = 0;
          //product.values();

        }

        HashMap<String,Integer> hMap = new HashMap<>();
        hMap.put("Tom hanks",13);
        hMap.put("Brad Pitt", 13);
        hMap.put("Angelina Julie",13);
        hMap.put("Cuneyt Arkin",13);
        hMap.put("Alex Alex",13);
        System.out.println(hMap);



            }
        }



