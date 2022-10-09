package Exercise3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Employee extends Person {
    private int salary;
    private String company;

    public Employee(String name, int age, int salary, String company) {
        super(name, age);
        this.salary = salary;
        this.company = company;
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;

    }

    public Employee() {

    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{ Name " + super.getName() + " age " +
                super.getAge() + " " +
                "salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }


    public List<String> getSalaryMoreSpecificAmount(List<Employee> list, int amount) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSalary() > amount) {
                System.out.println(list.get(i).getName());
               // result.add(i, list.get(i).getName());
                //result.add(i, list.get(i).getName(), list.get(i).getAge(), list.get(i).getSalary());
            }
        }
        return result;
    }
}



