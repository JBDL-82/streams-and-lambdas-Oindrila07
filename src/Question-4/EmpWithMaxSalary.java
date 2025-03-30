import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EmpWithMaxSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;

        System.out.print("Enter number of employees to be processed: ");
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

        Optional<Employee> highestPaid=employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary));

        highestPaid.ifPresent(e->System.out.println("Highest Paid is: "+e.getName()+", from"+
                e.getDepartment()+" department with salary = "+e.getSalary()));
    }
}
