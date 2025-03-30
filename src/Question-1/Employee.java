import java.util.List;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private String department;
    private int experience;

    Employee(String name, double salary, String department, int experience){
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.experience=experience;
    }

    double getSalary(){
        return this.salary;
    }

    String getName(){
        return this.name;
    }

    String getDepartment(){
        return this.department;
    }

    int getExperience(){
        return this.experience;
    }
}
