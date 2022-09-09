import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class july12 {

    public static void main(String[] args) {
        // There is a Map which contains product names as key and number of the products as value.
        //    Type code to find the total number of products


        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);


        Collection<Integer> numOfProducts = product.values();
        Integer sum = 0;

        for (Integer w : numOfProducts) {

            sum = sum + w;


        }

        System.out.println(sum);


        // There is a Map which contains product names as key and number of the products as value.
        //  Type code to check if ‘Laptop’ is among the products

        Map<String, Integer> product1 = new HashMap<>();

        product1.put("Laptop", 12);
        product1.put("TV", 53);
        product1.put("Refrigerator", 12);
        product1.put("Music System", 87);

        String expectedProduct = "Laptop";
        if (product.containsKey(expectedProduct)) {

            System.out.println(expectedProduct + "exist");

        } else {

            System.out.println(expectedProduct + " does not exist");

        }

        //There is a Map which contains product names as key and number of the products as value.
        //   Print the prices in ascending order.
        Map<String, Integer> product2 = new HashMap<>();
        product2.put("Laptop", 82);
        product2.put("TV", 53);
        product2.put("Refrigerator", 12);
        product2.put("Music System", 87);
        product2.put("Mobile Phone", 53);
        product2.put("Mobile ", 3);

        Object[] productPrices = product2.values().toArray();

        Arrays.sort(productPrices);

        System.out.println(Arrays.toString(productPrices));


        // There is a Map which contains product names as key and number of the products as value.
        //Print the product names in alphabetical order.
        Map<String, Integer> product3 = new HashMap<>();
        product3.put("Laptop", 82);
        product3.put("TV", 53);
        product3.put("Refrigerator", 12);
        product3.put("Music System", 87);
        product3.put("Mobile Phone", 53);
        product3.put(" Mobile Phone", 53);
        Object[] productNames = product3.keySet().toArray();

        Arrays.sort(productNames);

        System.out.println(Arrays.toString(productNames));

        // Type code to count the number of occurrences of the words in a String. (Case insensitive)

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        System.out.println(s);

        String[] letters = s.split("");

        System.out.println(Arrays.toString(letters));



            Map<String,Integer> result = new HashMap<>();

            for(String w : letters){

                Integer numOfOccurunce = result.get(w);

                if(numOfOccurunce==null){

                  result.put(w,1);

                }else {
                    result.put(w,numOfOccurunce+1);
                }

            }
        System.out.println(result);





        }


    }

