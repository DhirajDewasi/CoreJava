import java.util.Scanner;
	public class HelloNTimes{
		public static void main(String[] args){
			int n;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number to print:");
			n=sc.nextInt();

			for(int i=1;i<=n;i++)
			{
				System.out.println("Hello");
			}
			
	}
}