import java.util.Scanner;
	public class Even1ToN{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter N:");
			int n=sc.nextInt();

			System.out.println("Number:");
			for(int i=1;i<=n;i++)
			{
				System.out.println(+i);
			}

			System.out.println("Even number:");
			for(int i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					System.out.println(+i);
				}
			}
	}
}