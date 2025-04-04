package oppsUsingObj;
import java.util.Scanner;
public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData()
	{
		System.out.println("Enter the employeeId ");
		Scanner emp = new Scanner(System.in);
		employeeId=emp.nextInt();
		System.out.println("Enter the employeeName ");
		employeeName=emp.nextLine();
		employeeName=emp.nextLine();
		System.out.println("Enter the Employee Salary:");
		employeeSalary=emp.nextDouble();
		emp.close();
	}
	public void getEmployeeData()
	{
		System.out.println("Id of the Employee Is "+employeeId);
		System.out.println("Name of the Employee Is "+employeeName);
		System.out.println("Salary of the Employee is "+employeeSalary);
	}

}
