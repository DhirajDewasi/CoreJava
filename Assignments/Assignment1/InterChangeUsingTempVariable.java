import java.util.Scanner;
	public class InterChangeUsingTempVariable{
		public static void main(String[] args){
			int a,b,c;
			Double Swap;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first number:");
			a=sc.nextInt();
			System.out.println("Enter Second number:");
			b=sc.nextInt();
			
			System.out.println("Before Interchange:");
			System.out.println("a="+a);
			System.out.println("b="+b);

			c=a;
			a=b;
			b=c;
			
			System.out.println("After Interchange:");
			System.out.println("a="+a);
			System.out.println("b="+b);
	}
}	