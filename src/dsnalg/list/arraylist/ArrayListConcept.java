package dsnalg.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Doe", 27));
        employeeList.add(new Employee("John1", "Doe1", 28));
        employeeList.add(new Employee("John2", "Doe2", 29));
        employeeList.add(new Employee("John3", "Doe3", 30));

        //employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("Nina", "Heart", 53));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("Lisa", "Ann", 46));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("_____________________________________________________________");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        boolean flg = Arrays.asList(employeeArray).contains(new Employee("abc", "def", 100));

        System.out.println(flg);
    }
}
