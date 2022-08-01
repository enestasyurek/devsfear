package Enes.ClassEx;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String name;
    public int age;
    public String phone;
    public String email;
    public int grade;

    public ArrayList<String> kids;

    public Student(String name, int age, String phone, String email, int grade, String... kids) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.grade = grade;
        this.kids = new ArrayList<>(Arrays.asList(kids));
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", grade=" + grade + + '\'' +
                ", kids=" + kids +
                '}';
    }
}
