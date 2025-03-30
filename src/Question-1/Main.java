import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> emps= List.of(new Employee("Rahul",680200,"Sales",10),
                new Employee("Anjali",6700,"Tech",3),new Employee("Rakesh",100000,"SDE",8)
        ,new Employee("Prity",34000,"Accounts",4),new Employee("Anirudh",50000,"SDE",2),new Employee("Rishabh",54000,"Accounts",4)
        ,new Employee("Neha",50000.1,"Sales",6),new Employee("Subhash",19000,"Tech",5));

        emps.stream()
                .filter(obj->obj.getSalary()>50000.0)
                .forEach(obj -> System.out.println(obj.getName()+" "+obj.getSalary()));
    }
}