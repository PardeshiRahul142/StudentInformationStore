//Create a Java program using an Employee class with fields (empId, empName, salary). Store data of 4 employees in an array of objects. Perform the following operations:
//Accept employee details.
//
//
//Increase salary by 10% if the current salary is less than 30000.
//
//
//Display all employee details after the update.
//
//
//Explanation:
//This task helps you understand conditional logic, salary updates, and array traversal using class objects. You’ll learn to use percentage-based logic for salary increments.

package arr.obj;
import java.util.*;
class EmpD
{
	private int empId;
	private String empName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void inceaseSalary()
	{
		if(salary < 30000)
		{
			salary = salary + (salary * 0.10);
		}
	}
}
public class SalaryUpdate {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpD emp[]=new EmpD[5];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new EmpD();
			
			System.out.println("Enter the employee id name salary ");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double salary=sc.nextInt();
			
			emp[i].setEmpId(id);
			emp[i].setEmpName(name);
			emp[i].setSalary(salary);
		}
		
       for(int i=0;i<emp.length;i++)
       {
    	     emp[i].inceaseSalary();
       }
       for(int i=0;i<emp.length;i++)
       {
    	      System.out.printf("\n empId :%d empName :%s empSalary %.2f ", emp[i].getEmpId() , emp[i].getEmpName() , emp[i].getSalary());
       }
	}

}
