package day26;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    //FIFO means first in fist out prefer to use Queue
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();

        q1.add("Rick");
        q1.add("Maggie");
        q1.add("Glen");
        q1.add("Megan");
        q1.add("Daryl");

        System.out.println(q1);

        Queue<String> q2 = new LinkedList<>();

        System.out.println(q1.element());
     //q2.element();

        System.out.println( q1.peek());
        System.out.println(q2.peek());

        q1.offer("XXXXX");
        System.out.println(q1);

        System.out.println( q1.poll());// cut the head \nd paste
        System.out.println(q1);
  //when you use priortyqueue constructor to create
        Queue<String> q3 = new PriorityQueue<>();

        q3.add("Rick");
        q3.add("Maggie");
        q3.add("Glen");
        q3.add("Megan");
        q3.add("Daryl");

        System.out.println(q3);


    }

}
