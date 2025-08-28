import java.util.Scanner;
	public class Armstrong{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a number:");
			int n=sc.nextInt();
			
			int cnt=0;
			double rem;
			double result=0;

			int temp=n;
			
			while( n>0){
				cnt++;
				n=n/10;
			}
			n=temp;

			while(n>0){
				rem=n%10;
				result=result+Math.pow(rem,cnt);
				n=n/10;
			}

			if(result==temp){
				System.out.println("Number is Armstrong");
			}
			else{
				System.out.println("Number is not Armstrong");
			}
	}
}