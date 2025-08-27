import java.util.Scanner;
	public class EvenNo100To150{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Number from 100 to 150:");
			for( int i=100;i<=150;i++)
			{
				System.out.println(+i);
			}
			System.out.println(" Even number in 100 to 150:");
			for(int i=100;i<=150;i++)
			{
		
				if(i%2==0)
				{
					System.out.println("Even is:"+i);
				}
			}
	}
}