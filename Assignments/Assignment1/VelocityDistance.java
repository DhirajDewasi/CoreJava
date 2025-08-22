import java.util.Scanner;
	public class VelocityDistance{
		public static void main(String[] args){
		Float u,a,t;
		double V,D;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Intial Velocity:");
		u=sc.nextFloat();
		System.out.println("Enter Acceleration:");
		a=sc.nextFloat();
		System.out.println("Enter Time:");
		t=sc.nextFloat();

		V=u+a*t;
		D=u+a*t*t;
		System.out.println("Final velocity:"+V);
		System.out.println("Distance:"+D);

					

	}
}