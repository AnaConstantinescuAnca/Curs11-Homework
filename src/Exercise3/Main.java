package Exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //o lista de angajati
        List<Employee> list = new ArrayList<>();

        // add in lista ta angajati
        list.add(new Employee("Ionescu", 30, 2000, "Company1"));
        list.add(new Employee("Popescu", 50, 4000, "Company1"));
        list.add(new Employee("Vasilescu", 35, 3000, "Company2"));
        list.add(new Employee("Popa", 24, 2500, "Company3"));
        list.add(new Employee("Cristescu", 30, 6000, "Company3"));
        System.out.println("Lista angaja,tilor: ");
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
        employees.getSalaryMore(list, ammount);

        //3.2 extract a Map that gathers all the persons for a company
        System.out.println("Afisez persoanele grupate pe companii");
        Map<String, List<String>> listMap = new HashMap<>();
        // String nameCompany = null;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                String nameCompany = list.get(i).getCompany();
                if (!listMap.containsKey(nameCompany)) {
                    listMap.put(list.get(i).getCompany(), new ArrayList<>());
                }
                listMap.get(nameCompany).add(list.get(i).getName());
            }
            System.out.println(listMap.entrySet());
        } else {
            System.out.println("Avem o lista goala ");
        }

        //3.3 calculate the sum of all salaries for all employees
        System.out.println(String.format("Suma salariilor pentru toti angajatii este %d ",
                employees.sumSalaryOfEmployees(list)));

        //3.4 calculate which company gives the biggest salary

        int maxSalary = 0;
        String comp = null;
        for (int i = 0; i < list.size(); i++) {
            if (maxSalary < list.get(i).getSalary()) {
                maxSalary = list.get(i).getSalary();
                comp = list.get(i).getCompany();
            }
        }
        System.out.println(String.format("Compania %s ofera cel mai mare salariu de %d",
                comp,maxSalary));

    }


}