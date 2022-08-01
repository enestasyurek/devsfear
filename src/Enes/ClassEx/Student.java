package Enes.ClassEx;

public class Student {
    public String name;
    public int age;
    public String phone;
    public String email;
    public int grade;

    public Student(String name, int age, String phone, String email, int grade) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", grade=" + grade +
                '}';
    }
}
