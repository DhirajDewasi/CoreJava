import java.util.Scanner;
	public class Sum1ToNWithoutLoop{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a N:");
			int n=sc.nextInt();

			int sum=n*(n+1)/2;
			
			System.out.println("Sum of 1 to"+n+" is:"+sum);

	}

}