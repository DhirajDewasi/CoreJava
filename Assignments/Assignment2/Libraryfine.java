import java.util.Scanner;
	public class Libraryfine{
		public static void main(String[] args){
			int day,fine;
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter number of days:");
			day=sc.nextInt();
		
			if(day>=10)
				fine=100;
			else if(day<10&&day>=6)
				fine=50;
			else 
				fine=25;

			System.out.println("The fine is "+fine+" rupees");

	}
}