import java.util.Scanner;
	public class xpowern{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a x:");
			int x=sc.nextInt();
			int ans=1;
			System.out.println("Enter power of x:");
			int n=sc.nextInt();

			for(int i=1;i<=n;i++)
			{
				  ans=ans*x;
			}
			System.out.println(x+"^"+n+":" +ans);
	}
}