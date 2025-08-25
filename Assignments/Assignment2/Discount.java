import java.util.Scanner;
	public class Discount{
		public static void main(String[] args){
			int q1,q2,q3,r1,r2,r3,totalamt;
			float discount;
			double finalamt,discamt;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter quantity of item1:");
			q1=sc.nextInt();
			System.out.println("Enter rate of item1:");
			r1=sc.nextInt();

			System.out.println("Enter quantity of item2:");
			q2=sc.nextInt();
			System.out.println("Enter rate of item2:");
			r2=sc.nextInt();

			System.out.println("Enter quantity of item3:");
			q3=sc.nextInt();
			System.out.println("Enter rate of item3:");
			r3=sc.nextInt();

			totalamt=(q1*r1)+(q2*r2)+(q3*r3);

			if(totalamt>=15000)
				discount=20;
			else if(totalamt>=10000)
				discount=15;
			else
				discount=8;
		
			discamt=totalamt*discount/100;
			finalamt=totalamt-discamt;
			
			
			System.out.println("Amount:"+totalamt);
			System.out.println("Discounted Amount:"+discamt);
			System.out.println("Final Amount:"+finalamt);
	}
}