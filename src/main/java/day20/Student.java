package day20;

    /*
        1)Object-Oriented Programming Language(OOP) has 4 main principals
            i)Encapsulation   ii)Polymorphism   iii)Inheritance   iv)Abstraction
        2)Encapsulation: Data hiding
            i)Some data needs to be hidden like SSN, password, username...
            ii)By hiding some data we make our codes more readable
            iii)Encapsulation gives use flexibility
        3)How to hide data
          By using "private" access modifier, I can hide the data
        4)After hiding data how can you use it.
          After hiding data by the help of the getters I can access to encapsulated data
          Note: getter methods i)Should have "public" access modifier
                               ii)Its return type must be same with the data type of the variable
                               iii)getter methods are named like "get + capitalized variable name"
          But if the data type is boolean getter methods are named like "is + capitalized variable name"
          iv)getter methods do not use any parameter because they return the value of existing variable
        5)After hiding data how can you update it.
          After hiding data by the help of the setters I can update the encapsulated data
     */

public class Student {


    //1)Create private variables
    private String name = "Tom Hanks";
    private int age = 13;

   private  boolean successful = true;



    public int getAge() {
        return age;
    }

    public boolean isSuccessful() {
        return successful;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;





    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", successful=" + successful +
                '}';
    }
}