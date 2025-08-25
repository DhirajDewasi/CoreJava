import java.util.Scanner;
	public class ConditionalEvenOdd{
		public static void main(String[] args){
			int n;
			String result;
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter a number:");
			n=sc.nextInt();

			result = (n % 2 == 0) ? "Even" : "Odd";
			System.out.println("The number is:"+result);

	}
} 