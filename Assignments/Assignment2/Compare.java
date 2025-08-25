import java.util.Scanner;
	public class Compare{
		public static void main(String[] args){
			int num1,num2;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 2 number:");
			num1=sc.nextInt();
			num2=sc.nextInt();

			if(num1==num2)
				System.out.println(num1+"is equal to"+num2);

			else if(num1>num2)
				System.out.println(num1+"is greater than"+num2);

			else if(num1<num2)
				System.out.println(num1+"is less than"+num2);
	}
}  