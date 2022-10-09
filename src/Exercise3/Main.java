package Exercise3;

import Exercise2.Persons;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        //
        list.add(new Employee("Ionescu", 30, 2000, "Comp"));
        list.add(new Employee("Popescu", 50, 4000, "Comp"));
        list.add(new Employee("Vasilescu", 35, 3000, "Comp"));
        list.add(new Employee("Popa", 24, 2500, "Comp"));

        System.out.println("Lista angajatilor: ");
//
        if(!list.isEmpty()){
            for (Employee employee : list) {
                System.out.println(String.format("%s in varsta de %d ani, cu salariul de %d angajat la compania %s",
                        employee.getName(), employee.getAge(), employee.getSalary(), employee.getCompany()));
            }
        }else{
            System.out.println("Lista cu salariati este nula");
        }

        //3.1 extract persons that have salaries more than a specified ammount
        int amount  = 2000;

       Employee  employee = new Employee(null,0,0);
       List<String> personList = employee.getSalaryMoreSpecificAmount(list,amount);
        System.out.println("Persoanele cu salariul mai mare de " + amount + " sunt: " +
               personList);
                // employee.getSalaryMoreSpecificAmount(list,amount) );



    }


}