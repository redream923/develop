package com.xms.Stream;

/**
 * @author dpc
 * @create 2021-06-28 下午 2:39
 */
enum Status{
    FREE,//空闲
    BUSY,//繁忙
    VOCATION;//休假
}
public class Employee {
    String name;
    double salary;
    Status status;

    public Employee() {
    }

    public Employee(String name, double salary, Status status) {
        this.name = name;
        this.salary = salary;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }


}
