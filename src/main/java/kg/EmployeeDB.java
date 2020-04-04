package kg;

import entities.Employee;
import kg.util.HibernateUtil;
import org.hibernate.Session;

import java.util.LinkedList;
import java.util.List;

public class EmployeeDB {
    public static Employee create(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("succeed");
        return employee;
    }
    public static List<Employee> getAll(){
        Session session=HibernateUtil.getSessionFactory().openSession();
        List<Employee> employees=session.createQuery("From entities.Employee").list();
        session.close();
        return employees;
    }
    public static Employee update(Employee employee){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee e=session.load(Employee.class,employee.getId());
        e.setId(employee.getId());
        e.setName(employee.getName());
        e.setAge(employee.getAge());
        session.getTransaction().commit();
        session.close();
        return e;

    }
    public static Employee findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee employee = session.load(Employee.class, id);
        session.close();
        return employee;
    }
     public static void deleteById(Integer id){
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee employee=findById(id);
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
    }


    }
