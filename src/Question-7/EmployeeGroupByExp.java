import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeGroupByExp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int numEmp=sc.nextInt();

        List<Employee> employeeList= IntStream.range(0,numEmp)
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

        Map<Boolean, List<Employee>> groupedEmployees=employeeList.stream()
                .collect(Collectors.partitioningBy(emp->emp.getExperience()>=5));

        System.out.println("Employees with experience more than or equal to 5 years are listed below: ");
        System.out.print("[");
        groupedEmployees.get(true).forEach(empList->{
            System.out.print("[Name = "+empList.getName()+", Experience = "+empList.getExperience()+"]");
        });
        System.out.println("]");

        System.out.println("Employees with experience less than 5 years are listed below: ");
        System.out.print("[");
        groupedEmployees.get(false).forEach(empList->{
            System.out.print("[Name = "+empList.getName()+", Experience = "+empList.getExperience()+"]");
        });
        System.out.println("]");
    }
}
