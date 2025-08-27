import java.util.Scanner;
	public class SumXToY{
		public static void main(String[] args){
			int sum=0;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter x:");
			int x=sc.nextInt();
			System.out.println("Enter y:");
			int y=sc.nextInt();

			for(int i=x;i<=y;i++)
			{
			   sum=sum+i;
			}
			
			System.out.println("Sum of x to y:"+sum);

	}
}