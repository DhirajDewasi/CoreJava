import java.util.Scanner;
	public class CountEvenAndOdd{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int even=0,odd=0,zero=0;

			System.out.println("Enter a number:");
			int n=sc.nextInt();

			if(n<0){
				n=-n;
			}

			if(n==0){
				 zero=1;
			}

			else{
				while(n!=0){
					int digit=n%10;
			
					if(digit==0){
						zero++;
					}
					else if(digit%2==0){
						even++;
					}
					else{
						odd++;
					}
			
					n=n/10;
						

					
				}
			}

			System.out.println("Zero:"+zero);
			System.out.println("Even:"+even);
			System.out.println("Odd:"+odd);
	}
}