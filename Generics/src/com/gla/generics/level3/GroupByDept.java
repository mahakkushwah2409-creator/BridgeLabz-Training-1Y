package com.gla.generics.level3;
import java.util.*;
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return name;
    }
}
public class GroupByDept {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            map.putIfAbsent(e.department, new ArrayList<>());
            map.get(e.department).add(e);
        }

        System.out.println(map);
    }
}