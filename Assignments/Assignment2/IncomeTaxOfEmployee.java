import java.util.Scanner;
	public class IncomeTaxOfEmployee{
		public static void main(String[] args){
			float bs,tax,finalsalary;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a Basic Salary of Employee:");
			bs=sc.nextFloat();
			
			if(bs<150000)
			{
				tax=0;
			}
			else if(bs>=150000&&bs<300000)
			{
				tax=20;
			}
			else
			{
				tax=30;
			}
			finalsalary=bs*tax/100;
			System.out.println("Basic salary is:"+bs);
			System.out.println("Tax is:"+tax);
			System.out.println("Total Salary is:"+finalsalary);  

		
	}
}