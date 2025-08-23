import java.util.Scanner;
	public class InterChangeWithoutTempVarUsing{
		public static void main(String[] args){
			
			int a,b;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first number:");
			a=sc.nextInt();
			System.out.println("Enter Second Number:");
			b=sc.nextInt();

			System.out.println("Using + and -"); 

			System.out.println("Before Interchange:");			
			System.out.println("a="+a);
			System.out.println("b="+b);
			
			a=a+b;
			b=a-b;
			a=a-b;

			System.out.println("After Interchange:");
			System.out.println("a="+a);
			System.out.println("b="+b);
			
			System.out.println("Using * and /");
			
			System.out.println("Before Inter change:");
			System.out.println("a="+a);
			System.out.println("b="+b);
			
			
			a=a*b;
			b=a/b;
			a=a/b;
			System.out.println("After Inter change:");
			System.out.println("a="+a);
			System.out.println("b="+b);

			
	}
}