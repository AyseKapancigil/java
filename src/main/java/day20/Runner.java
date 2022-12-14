package day20;

import day21.Cat;
import day21.Dog;

public class Runner {

        /*
            1)"private" class members cannot be inherited by Child Classes from Parent Class(Impossible to inherit)
            2)"public" class members can be inherited(Always can be inherited)
            3)"protected" class members can be inherited(Always can be inherited)
            4)"default" class members cannot be inherited from other packages(If you are in same package it can be inherited)
            Note 1: When you call a "variable" in parent-child relationship, look at the "data type" of the object
Note 2: When you call a "method" in parent-child relationship, look at the "constructor" of the object
Note 3: There is "IS-A" relationship from "Child Class" to "Parent Class"
Note 4: There is "HAS-A" relationship from "Parent Class" to "Child Class"
Note 5: If there is no "parent-child relationship" you cannot have "IS-A" or "HAS-A" relationship
         */

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.drink();
        cat1.eat();
        cat1.weight();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.drink();
        dog1.eat();

    }
}