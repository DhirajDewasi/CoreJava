import java.util.Scanner;
	public class SumCountFactor{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a number:");
			int n=sc.nextInt();
			int sum=0,cnt=0;
			
			System.out.println("Factor of "+n+":");
			for(int i=1;i<=n;i++){
				if(n%i==0){
				System.out.println(i);
				sum=sum+i;
				cnt++;
				}

			}
			System.out.println("Sum of factor :"+sum);
			System.out.println("Count of factor:"+cnt);

	}
}