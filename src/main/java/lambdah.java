import java.util.ArrayList;
import java.util.List;

public class lambdah {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);
        System.out.println();
        getMinValue(l);


    }
    //8)Create a method to find the minimum value from the list elements(Method Reference)
    public static void getMinValue(List<Integer>list){

       Integer min =  list.stream().distinct().reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);

    }
}
