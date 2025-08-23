import java.util.Scanner;
	public class TakeHomeSalaryOfEmployee{
		public static void main(String[]args){
			int id;
			float bs,da,hra,tax;
			double takehomesalary;			
			Scanner sc=new Scanner(System.in);

			
			System.out.println("-----Enter Employee Details-----");
			System.out.println("ID:");
			id=sc.nextInt();
			System.out.println("Basic Salary:");
			bs=sc.nextFloat();
			
			hra=bs*10/100;
			da=bs*30/100;
			tax=bs*5/100;
                        takehomesalary=bs+hra+da-tax;
		
			System.out.println("Employee ID:"+id);
			System.out.println("Basic Salary:"+bs);
			System.out.println("House Rent Allowance:"+hra);
			System.out.println("Dearness Allowance:"+da);
			System.out.println("Tax:"+tax);
			System.out.println("Take Home Salary:"+takehomesalary);
	}
}