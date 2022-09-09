package practice08;

import org.w3c.dom.ls.LSOutput;

public class MarketRunner {

    public static void main(String[] args) {


        Market product1 = new Market("Milk", 1.5, 2);

        Market product2 = new Market("Keyboard", 10.05); {
            System.out.println(product2.productName+product2.productPrice+product2.expirationDate);



        }
    }

}
