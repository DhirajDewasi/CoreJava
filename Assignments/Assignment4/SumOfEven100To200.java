import java.util.Scanner;
	public class SumOfEven100To200{
		public static void main(String[] args){
			int evsum=0,odsum=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Even:");
			for(int i=100;i<=200;i++)
			{
				if(i%2==0)
				{
					System.out.println(+i);
					evsum=evsum+i;
				}
				
				
			}
			System.out.println("Sum of Even:"+evsum);
			
			System.out.println("Odd :");
			for(int i=100;i<=200;i++)
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