import java.util.Scanner;
	public class Divisible57Or{
		public static void main(String[] args){
			int n;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number:");
			n=sc.nextInt();
			
			if(n%5==0||n%7==0)
				System.out.println(n+" is divisible by both 5 & 7");
			else 
				System.out.println(n+"is  not divisible by both 5 & 7"); 
	}
}