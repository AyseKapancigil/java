package practice08;

import java.time.LocalDate;

public class Market {
    //Type a supermarket program to see product name, product price and expiration date.


 String productName;
 double productPrice;
 LocalDate expirationDate;

 Market(String proName,double proPrice, int monthLater){

  productName= proName;
  productPrice=proPrice;
  expirationDate=LocalDate.now().plusMonths(15);

 }


 Market(String proName ,double proPrice){
  productName= proName;
  productPrice=proPrice;

 }

}

