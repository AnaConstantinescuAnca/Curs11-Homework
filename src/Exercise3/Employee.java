package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private int salary;
    private String company;


    public Employee() {

    }
    public Employee(String name, int age, int salary, String company) {
        super(name, age);
        this.salary = salary;
        this.company = company;
    }

    public Employee(List<Employee> employeeList, int ammount) {
        super(employeeList, ammount);

    }


    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }


    public void getSalaryMore(List<Employee> lista, int ammount) {
        if (!lista.isEmpty() || ammount > 0) {
            for (Employee employee : lista) {
                if (employee.getSalary() > ammount) {
                    System.out.println(employee.getName() + " cu salariul de " + employee.getSalary());
                }
            }
        } else {
            System.out.println("Lista este goala");
        }
    }

    public int sumSalaryOfEmployees(List<Employee> lista){
        int sumOfSalary = 0;
        for(Employee employee : lista){
            sumOfSalary += employee.getSalary();
        }
        return sumOfSalary;
    }


}



