import java.util.Scanner;
	public class SumOfEven1ToN{
		public static void main(String[] args){
			int evsum=0,odsum=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a N:");
			int n=sc.nextInt();

			System.out.println("Even:");
			for(int i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.println(+i);
					evsum=evsum+i;
				}
				
				
			}
			System.out.println("Sum of Even:"+evsum);
			
			System.out.println("Odd :");
			for(int i=1;i<=n;i++)
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