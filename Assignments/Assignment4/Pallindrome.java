import java.util.Scanner;
	public class Pallindrome{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a number:");
			int n=sc.nextInt();
			int temp=n,rev=0;

			while(n>0){
				int rem=n%10;
				 rev=rev*10+rem;
				n/=10;
			}
			if(temp==rev){
				System.out.println("Number is pallindrome");
			}
			else{
				System.out.println("Number is not pallindrome");
			}


	}
}