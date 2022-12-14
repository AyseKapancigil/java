package day03;

public class Day03ObjectCreation {

        /*
            We learned how to create template
            1)How to create a class
            2)How to create methods in a class
            3)How to create variables ina class

            How to create object from a class
         */

    public static void main(String[] args) {

        //Create an object to be able to use non-static class members(methods + variables)
        //ClassName          Object Name       =      new        ClassName()           ;
        Day03ObjectCreation   myObject         =      new    Day03ObjectCreation()     ;

        System.out.println(myObject.calculateAge(1990));
        System.out.println(myObject.printName("Mark", "Twain"));

        System.out.println(myObject.height);
        System.out.println(myObject.id);
    }

    public String printName(String firstname, String lastname){
        return firstname + " " + lastname;
    }
    public int calculateAge(int dob){
        return 2022 - dob;
    }

    int height = 185;
    String id = "Sp2022-001";
}







