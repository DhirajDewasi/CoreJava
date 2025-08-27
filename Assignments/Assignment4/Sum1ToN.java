import java.util.Scanner;
	public class Sum1ToN{
		public static void main(String[] args){
			
			int sum=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a N:");
			int n=sc.nextInt();

			for(int i=1;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum 1 to n:"+sum);
	}				
}