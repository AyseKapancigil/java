import java.util.ArrayList;
import java.util.List;

public class Lambda {


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

        //
        // minValue(l);

        //minValue2(l);


    }
    //Homework
    //8)Create a method to find the minimum value from the list elements(In 2 ways)


   public static void minValue1(List<Integer>list){

       Integer min1 =  list.stream().distinct().sorted().findFirst().get();

       System.out.println(min1);

     //   public static void minValue2(List<Integer>list){

     Integer min2 =    list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)-> t<u ?t:u);

            System.out.println(min2);

        }

    }

