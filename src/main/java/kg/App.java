package kg;

import entities.Employee;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali", 23);
        Employee employee = new Employee("Anna", 34);
        Employee employee2 = new Employee("Marry", 18);

        EmployeeDB.create(employee);
        EmployeeDB.create(employee1);
        EmployeeDB.create(employee2);
        EmployeeDB.deleteById(2);
        EmployeeDB.findById(1);
EmployeeDB.getAll().stream().forEach(x->System.out.println(x));
        List<Employee> employees=EmployeeDB.getAll();
        for (Employee e:employees){
            System.out.println(e);
        //List<Employee> employees = EmployeeDB.getAll();
       // Stream<Employee> employeeStream = employees.stream();
        //employeeStream.filter(x -> x.getName().contains("A")).forEach(x -> System.out.println(x));
        //for (Employee e : employees) {
           // if (employees.getName().contains("A") {
           // System.out.println();(employee);
                Employee employee3 = new Employee();
                employee3.setId(1);
                employee3.setName("kristy");
                employee3.setAge(24);
                EmployeeDB.update(employee3);

            }
        }
    }
