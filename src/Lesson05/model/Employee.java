package Lesson05.model;

public class Employee {
    public String shortInfo;
    public String name;
    public String position;
    public String email;
    public int phoneNumber;
    public int salary;
    public int age;

    public Employee(String shortInfo, String name, String position, String email, int phoneNumber, int salary, int age) {
        this.shortInfo = shortInfo;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.println(shortInfo + ": Hello! My name is " + name + ". I am " + position + ", my email: " + email + ", my contact number is: " + phoneNumber + " and I am very happy to start work!");
        System.out.println();
    }
}
