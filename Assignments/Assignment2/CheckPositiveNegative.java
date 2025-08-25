import java.util.Scanner;
	public class CheckPositiveNegative{
		public static void main(String[] args){
			int num;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a number to chech positive or negative:");
			num=sc.nextInt();

			if(num>0)
				System.out.println("Positive Number");
			else
				System.out.println("Negative Number");
	}
}