import java.util.Scanner;
	public class XToYEvenOdd{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter x:");
			int x=sc.nextInt();

			System.out.println("Enter y;");
			int y=sc.nextInt();
				
			System.out.println("Even:");
			for(int i=x;i<=y;i++)
			{
				if(i%2==0)
				{
					System.out.println(+i);
				}
				
			} 

			System.out.println("Odd:");
			for(int i=x;i<=y;i++)
			{
				if(i%2!=0)
				{
					System.out.println(+i);
				}
			}
	}
}