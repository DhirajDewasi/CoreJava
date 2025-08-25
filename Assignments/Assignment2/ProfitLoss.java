import java.util.Scanner;
	public class ProfitLoss{
		public static void main(String[] args){
			float cp,sp,sum;
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter cost price:");
			cp=sc.nextFloat();
			System.out.println("Enter sell price:");
			sp=sc.nextFloat();
			
			if(sp>cp)
			{
				sum=sp-cp;
				System.out.println("Made profit :"+sum);
			}
			else
			{
				sum=cp-sp;
				System.out.println("Made loss:"+sum);
			}

			
	}
}