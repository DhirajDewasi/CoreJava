import java.util.Scanner;
	public class SumOfGivenNumber{
		public static void main(String[] args){
			Scanner sc =new Scanner(System.in);
			int sum=0;

			System.out.println("Enter a number:");
			int n=sc.nextInt();

			if(n<0){
				n=-n;
			}

			while(n>0){
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			System.out.println("Sum :"+sum);
	}
}