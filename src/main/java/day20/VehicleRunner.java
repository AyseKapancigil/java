package day20;

public class VehicleRunner {

    public static void main(String[] args) {

        Vehicles v1 = new Vehicles("honda","Civic", 2021,13000);
         Vehicles v2 = new Vehicles("Audi","RS",2022,50000);
        Vehicles v3 = new Vehicles("mercedes","C300",2020);
        Vehicles v4 = new Vehicles("BMW","M5",150000.0);
       Vehicles v5 = new Vehicles();

        System.out.println( v1.model);
        System.out.println(v2.price);
        System.out.println(v4.make);



    }

    }


