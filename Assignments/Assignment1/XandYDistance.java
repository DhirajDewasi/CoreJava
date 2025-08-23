import java.util.Scanner;
	public class XandYDistance{
		public static void main(String[] args){
			float x1,y1,x2,y2,distance;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter X coordinates:");
			x1=sc.nextFloat();
			x2=sc.nextFloat();
			System.out.println("Enter Y coordinates:");
			y1=sc.nextFloat();
			y2=sc.nextFloat();
		
			distance=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println("Distance:"+distance);	

	}
}