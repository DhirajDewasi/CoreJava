import java.util.Scanner;
	public class AreaToPaintedWhitewashed{
		public static void main(String[] args){
			float Rooml,Roomb,Roomh,doorh,doorw,windowh,windoww,Areapainted,AreaWhitewashed,roomarea,doorarea,windowarea;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Room Dimenssion(length,breadth,height");
			Rooml=sc.nextFloat();
			Roomb=sc.nextFloat();
			Roomh=sc.nextFloat();
			
			System.out.println("Enter Door height and width:");
			doorh=sc.nextFloat();
			doorw=sc.nextFloat();
		
			System.out.println("Enter Window height and width:");
			windowh=sc.nextFloat();
			windoww=sc.nextFloat();

			roomarea=2*Roomh*(Rooml+Roomb);
			doorarea=doorw*doorh;
			windowarea=2*windowh*windoww;

			Areapainted=roomarea-(doorarea+windowarea);
			AreaWhitewashed=Rooml*Roomb;
	
			System.out.println("Area to be painted:"+Areapainted);
			System.out.println("Area to be Whitewashed:"+AreaWhitewashed);

			
	}
}