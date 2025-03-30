import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numEmp=sc.nextInt();

        List<Employee> employeeList=IntStream.range(0,numEmp)
                .mapToObj(emp->{
                    System.out.println("Enter Employee details for Employee "+(emp+1)+": ");
                    System.out.print("Enter Employee salary: ");
                    double salary= sc.nextDouble();
                    System.out.print("Enter Employee department: ");
                    String dep=sc.next();
                    System.out.print("Enter Employee experience: ");
                    int exp=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name=sc.nextLine();
                    return new Employee(name,salary,dep,exp);
                }).toList();

        Map<String, List<Employee>> groupedByDept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDept.forEach((dept,emp)->{
            String e=emp.stream().map(s->s.getName()+" ("+s.getDepartment()+")")
                    .collect(Collectors.joining(", "));
            System.out.println(dept+" : "+" ["+e+"]");
        });
    }
}