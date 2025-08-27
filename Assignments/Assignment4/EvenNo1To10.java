import java.util.Scanner;
	public class EvenNo1To10{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Even:");
			for(int i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					System.out.println(+i);
				}
			}
			
			System.out.println("Odd :");
			for(int i=1;i<=10;i++)
			{
				if(i%2!=0)
				{
					System.out.println(+i);
				}
			}
	}
}