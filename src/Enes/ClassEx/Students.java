package Enes.ClassEx;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class Students {
    public static void main(String[] args) {
        Student student1 = new Student("Enes", 20, "0555555555", "asd@gmail.com",7, "Enes", "Sefa");
        //System.out.println(student1);
        Student student2 = new Student("Güngör", 21, "0555555555", "zxc@gmail.com",8);


        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(student1,student2));
        System.out.println(students);
    }
}
