package Enes.ClassEx;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public String phone;
    public String email;
    public int grade;

    static String solid = "solid";

    public ArrayList<String> siblings;

    public Student(String name, int age, String phone, String email, int grade, String... siblings) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.grade = grade;
        this.siblings = new ArrayList<>(Arrays.asList(siblings));
    }


    // Created a constructor that takes an ArrayList of siblings.
/*    public Student(String name, int age, String phone, String email, int grade, ArrayList<String> siblings) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.grade = grade;
        this.siblings = siblings;
    }*/



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", grade=" + grade + + '\'' +
                ", siblings=" + siblings +
                '}';
    }
}
