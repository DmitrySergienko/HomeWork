package Lesson5;

public class Employee {

    String name;
    String position;
    String email;
    String phone;
    Integer salary;
    Integer age;

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public String info(){
        System.out.println("_________________");
        String person = new String("ФИО:  " + name + "\nДолжность: " + position + "\nemail: " + email + "\nТелефон:" + phone +"\nЗарплата: " + salary + "\nВозраст: " + age);
        return person;
    }
}
