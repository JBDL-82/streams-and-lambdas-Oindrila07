public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    double getSalary(){
        return this.salary;
    }

    String getName(){
        return this.name;
    }
}
