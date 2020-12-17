package _10_generic_stack_queue._03_optional.use_queue;

import java.util.Comparator;
import java.util.Queue;

public class Employee {
    private String name;
    private String gender;
    private int date;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Employee(String name, String gender, int date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }

}