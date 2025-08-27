import java.util.Scanner;
	public class SumXToYEvenOdd{
		public static void main(String[] args){
			int evsum=0,odsum=0;
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
					evsum=evsum+i;
				}
				
			} 
			System.out.println("Sum of Even:"+evsum);

			System.out.println("Odd:");
			for(int i=x;i<=y;i++)
			{
				if(i%2!=0)
				{
					System.out.println(+i);
					odsum=odsum+i;
				}

			}
			System.out.println("Sum of Odd:"+odsum);
	}
}