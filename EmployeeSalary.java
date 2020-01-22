import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the employee id:");

        String id = scanner.next();
        System.out.println("enter employee name:");
        String employee = scanner.next();

        System.out.println("enter  basic salary");

        int basicsalary = scanner.nextInt();

        System.out.println("employee id:" + id);
        System.out.println("employee name is: +" + employee);
        System.out.println("basic salary is:" + basicsalary);

        double hra = (basicsalary * 10.0) / 100;
        double da = (basicsalary * 8.0) / 100;
        double ta = (basicsalary * 9.0) / 100;
        double pf = (basicsalary * 20.0) / 100;
        double grosssalary = basicsalary + hra + da + ta - pf;


        System.out.println("hra :" + hra);
        System.out.println("da :" + da);
        System.out.println("ta:" + ta);
        System.out.println("pf:" + pf);
        System.out.println("gross salary is :" + grosssalary);
    }


}