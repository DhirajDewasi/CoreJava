import java.util.Scanner;
	public class ArthmeticHarmonic{
		public static void main(String[] args){
			int a,b;
			double arth,har;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number:");
			a=sc.nextInt();
			System.out.println("Enter Second number:");
			b=sc.nextInt();
			
			arth=(a+b)/2;
			har=a*b/(a+b);
			System.out.println("Arthmetic:"+arth);
			System.out.println("Harmonic:"+har);

                     
	
	}
	
}