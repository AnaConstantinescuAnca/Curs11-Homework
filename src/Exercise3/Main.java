package Exercise3;

import Exercise2.Persons;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //o lista de angajati
        List<Employee> list = new ArrayList<>();

        // add in lista ta angajati
        list.add(new Employee("Ionescu", 30, 2000, "Comp"));
        list.add(new Employee("Popescu", 50, 4000, "Comp"));
        list.add(new Employee("Vasilescu", 35, 3000, "Comp"));
        list.add(new Employee("Popa", 24, 2500, "Comp"));

        System.out.println("Lista angajatilor: ");
//
        if (!list.isEmpty()) {
            for (Employee employee : list) {
                System.out.println(String.format("%s in varsta de %d ani, cu salariul de %d angajat la compania %s",
                        employee.getName(), employee.getAge(), employee.getSalary(), employee.getCompany()));
            }
        } else {
            System.out.println("Lista cu salariati este goala");
        }


        //3.1 extract persons that have salaries more than a specified ammount
        int ammount = 2000;
        Employee employees = new Employee(list, ammount);
        //afisez persoanele cu salariul mai mare de 2000
        System.out.println(String.format("Persoanele cu salariul mai mare de %d sunt:", ammount));
        employees.getSalaryMore(list,ammount);
    }
}