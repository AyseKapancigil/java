import java.util.HashMap;
import java.util.Map;

public class june08 {

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        System.out.println(product);

        System.out.println(product.values());
        Integer sum=0;
        for(Integer w: product.values()){
            sum =sum+w;

            System.out.println(sum);
        }

    }
}
