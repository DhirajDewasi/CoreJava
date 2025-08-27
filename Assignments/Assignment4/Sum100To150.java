import java.util.Scanner;
	public class Sum100To150{
		public static void main(String[] args){
			int sum=0;
			Scanner sc=new Scanner(System.in);

			for(int i=100;i<=150;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum 100 to 150:"+sum);

			
	}
}
