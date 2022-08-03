package Enes.ClassEx;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;


public class Students {
    public static void main(String[] args) {

        // Student student1 = new Student("Enes", 20, "0555555555", "asd@gmail.com",7, new ArrayList<String>(Arrays.asList("Enes", "Enes")));
        // Create a Student object with the ArrayList of kids.



        Student student1 = new Student("Enes", 20, "0555555555", "asd@gmail.com",7, "Elif", "Sefa");
        Student student2 = new Student("Güngör", 21, "0555555555", "zxc@gmail.com",8);

        student2.siblings.add("XXX");
        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(student1,student2));

        System.out.println("---------------------------------------");
        students.forEach(p -> System.out.println(p));
        System.out.println("---------------------------------------");
        System.out.println(Student.solid);
        System.out.println("---------------------------------------");
        System.out.println(students);
        System.out.println("---------------------------------------");
        for (Student student : students) {
            System.out.println(student);

        }
        System.out.println("---------------------------------------");
    }
}
