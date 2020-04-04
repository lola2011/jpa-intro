package entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="employee")// ne obyazatelno,on i tak naydet
public class Employee {
    @Id //undermust in every class
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="age", nullable=false)
    private Integer age;



   public Employee(){

   }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';



    }
}
