package Algorithms.Hash;

import java.util.HashMap;
import java.util.HashSet;

public class hashImplement {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Bob", 12, "Tech");
        Employee emp2 = new Employee("Rob", 11, "Software");
        Employee emp3 = new Employee("Tobby", 13, "Sales");

        HashMap<Integer, Employee> employeesById = new HashMap<>();
        employeesById.put(emp1.id, emp1);
        employeesById.put(emp2.id, emp2);
        employeesById.put(emp3.id, emp3);

        System.out.println(employeesById.get(12).name);
        System.out.println(employeesById.get(11).name + ":" + employeesById.get(11).department);

        HashSet<String> productCodes = new HashSet<>();
        productCodes.add("123");
        productCodes.add("456");
        productCodes.add("789");

        System.out.println(productCodes.contains("123"));
        System.out.println(productCodes.contains("457"));
    }
}
