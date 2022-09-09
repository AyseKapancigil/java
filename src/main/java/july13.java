import java.util.*;

public class july13 {

    public static void main(String[] args) {
        // There is a Map which contains product names as key and number of the products as value.
        // Type code to find the total number of products.
//        Map<String, Integer> product = new HashMap<>();
//        product.put("Laptop", 12);
//        product.put("TV", 53);
//        product.put("Refrigerator", 12);
//        product.put("Music System", 87);
//
//        Collection<Integer> values1 = product.values();
//
//        System.out.println(values1);
//        int sum = 0;
//        for (Integer w : values1) {
//
//            sum = sum + w;
//
//
//        }
//        System.out.println(sum);
//
//
//        //There is a Map which contains product names as key and number of the products as value.
//        //  Type code to check if ‘Laptop’ is among the products.
//        Map<String, Integer> product2 = new HashMap<>();
//        product2.put("Laptop", 12);
//        product2.put("TV", 53);
//        product2.put("Refrigerator", 12);
//        product2.put("Music System", 87);
//
//        // Set<String> myKeySet= product2.keySet();
//
//        if (product2.containsKey("Laptop") ) {
//            System.out.println("Laptop exist");
//        } else {
//            System.out.println("not exist");

           // There is a Map which contains product names as key and number of the products as value.
                  //  Print the prices in ascending order.
                    Map<String, Integer> product3 = new HashMap<>();
            product3.put("Laptop", 82);
            product3.put("TV", 53);
            product3.put("Refrigerator", 12);
            product3.put("Music System", 87);
            product3.put("Mobile Phone", 53);

          Object cengiz []=product3.values().toArray();

            System.out.println(Arrays.toString(cengiz));

        Arrays.sort(cengiz);
        System.out.println(Arrays.toString(cengiz));

       // There is a Map which contains product names as key and number of the products as value.
               // Print the product names in alphabetical order.
//        Map<String, Integer> product = new HashMap<>();
//        product.put("Laptop", 82);
//        product.put("TV", 53);
//        product.put("Refrigerator", 12);
//        product.put("Music System", 87);
//        product.put("Mobile Phone", 53);
//
//       Set<String> mySet= product.keySet();
//   List<String>myList =new ArrayList<>(mySet);
//
//   Collections.sort(myList);
//
//        System.out.println(myList);
//
//
//        Set<String> productNamesAsSet = product.keySet();
//        List<String> productNamesAsList = new ArrayList<>(productNamesAsSet);
//        Collections.sort(productNamesAsList);
//        System.out.println(productNamesAsList);
//
       // type code to count the number of occurrences of the words in a String. (Case insensitive)
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        s = s.replaceAll("\\p{Punct}","").toLowerCase();

        System.out.println(s);

      String [] arr = s.split(" ");

        Map<String,Integer> myMap = new HashMap<>();

        for(String w : arr){
Integer numOfoccurunce = myMap.get(w);
            if(numOfoccurunce==null){

                myMap.put(w,1);


            }else{
myMap.put(w,numOfoccurunce+1);

            }

        }

        System.out.println(myMap);


        }
    }
