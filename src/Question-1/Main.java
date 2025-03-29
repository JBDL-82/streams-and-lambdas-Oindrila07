import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> employeeNames = List.of("Alexa Rogers","Souvik Pal","Anirush Ghosh","Alok Kaur","Mahi Roy","Oindrila Som","Raka Chatterjee");

        List<Double> salaries = List.of(12000.3,39990.4,4893020.0,59930.10,10000.0,80000.0,54000.10);

        List<Employee> emps= IntStream.range(0,employeeNames.size())
                .mapToObj(i->new Employee(employeeNames.get(i),salaries.get(i)))
                .toList();

        emps.stream()
                .filter(obj->obj.getSalary()>50000.0)
                .forEach(obj -> System.out.println(obj.getName()+" "+obj.getSalary()));
    }
}