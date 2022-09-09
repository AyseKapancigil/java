package practicefaizan03;

public class Student {

   String name;
   int rollNum;

    public static void main(String[] args) {
        Student st = new Student();
        st.name="Ayse";
        st.rollNum= 1234;

        System.out.println(st.name+" "+st.rollNum);

//        package com.generics.example;
//
//        class Student{
//            String studentName;
//            int studentNumber;
//
//            public Student(String studentName, int studentNumber) {
//                this.studentName = studentName;
//                this.studentNumber = studentNumber;
//            }
//        }
//        public class OOP1 {
//            public static void main(String[] args) {
//                Student student1 = new Student("Tom", 9001);
//                System.out.println(student1.studentName+ " "+ student1.studentNumber);
//            }
//        }


    }

}
