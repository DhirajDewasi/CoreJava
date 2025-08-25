import java.util.Scanner;
	public class Grade{
		public static void main(String[] args){
			float m1,m2,m3,avg,total;
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter Student marks :");
			m1=sc.nextFloat();
			m2=sc.nextFloat();
			m3=sc.nextFloat();
		
			total=m1+m2+m3;
			avg=total/3;

			System.out.println("Average="+avg);
			
			if(avg>=90)
				System.out.println("Grade is A");
			else if(avg<90&&avg>=70)
				System.out.println("Grade is B");
			else if(avg<70&&avg>=50)
				System.out.println("Grade is C");
			else if(avg<50&&avg>=40)
				System.out.println("Grade D");
			else
				System.out.println("Fail");
			
	}
}