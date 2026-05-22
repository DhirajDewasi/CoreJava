import java.util.Scanner;
public class EmployeeSalarySlip{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		float bs,da,hra,tax,totalSalary;
		
		System.out.println("Enter Employee Details:");
		System.out.println("Id:");
		id=sc.nextInt();
		System.out.println("Name:");
		name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Basic Salary:");
		bs=sc.nextFloat();
		System.out.println("Da:");
		da=sc.nextFloat();
		System.out.println("Hra:");
		hra=sc.nextFloat();
		System.out.println("Tax:");
		tax=sc.nextFloat();

		totalSalary=bs+((bs*(da+hra-tax))/100);

		
		System.out.println("Employee Details n:");
		System.out.println("Id               :"+id);
		System.out.println("Name             :"+name);
		System.out.println("Total Salary     :"+totalSalary);
	
	}
}