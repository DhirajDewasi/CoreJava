import java.util.Scanner;
	public class CheckNobetween{
		public static void main(String[] args){
			int num1,num2,num3;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter First number:");
			num1=sc.nextInt();
			System.out.println("Enter Second number:");
			num2=sc.nextInt();
			System.out.println("Enter Third number:");
			num3=sc.nextInt();

			if((num2<num1&&num1<num3)||(num3<num1&&num1<num2))
				System.out.println(num1+"is between "+num2+"and" +num3 );
			else
				System.out.println(num1+"is not between "+num2+"and" +num3);
	}
}