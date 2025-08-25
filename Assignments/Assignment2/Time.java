import java.util.Scanner;
	public class Time{
		public static void main(String[] args){
			int hr,min,sec;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a Hour:");
			hr=sc.nextInt();
			System.out.println("Enter a Minute:");
			min=sc.nextInt();
			System.out.println("Enter a Second:");
			sec=sc.nextInt();
	
			if((0<=hr&&hr<24)&&(0<=min&&min<60)&&(0<=sec&&sec<60))
				System.out.println("Time is valid");
			else
				System.out.println("Time is not valid");
				
	}
}