import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> emps= List.of(new Employee("Rahul",680200),
                new Employee("Anjali",6700),new Employee("Rakesh",100000)
        ,new Employee("Prity",34000),new Employee("Anirudh",50000),new Employee("Rishabh",54000)
        ,new Employee("Neha",50000.1),new Employee("Subhash",19000));

        emps.stream()
                .filter(obj->obj.getSalary()>50000.0)
                .forEach(obj -> System.out.println(obj.getName()+" "+obj.getSalary()));
    }
}