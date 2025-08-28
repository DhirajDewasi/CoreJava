import java.util.Scanner;
	public class CountOfNumber{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			int digit=0;

			System.out.println("Enter a number:");
			int n=sc.nextInt();

			if(n<0)
			{
				n= -n;
			}

			if(n==0)
			{
				 digit=1;
			}
			else{
				while(n!=0){
					n=n/10;
					digit++;
				}	
			}
			System.out.println("Number digit is:"+digit);
	}
}