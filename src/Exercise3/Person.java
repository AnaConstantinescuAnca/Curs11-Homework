package Exercise3;

import java.util.List;

public class Person {
    private String name;
    private int age;


    public  Person(){ }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(List<Employee> employeeList, int ammount) {
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
