import java.util.Scanner;
	public class AreaVolumeOfCuboid{
		public static void main(String[] args){
		Float l,b,h;
		double SurfaceArea,Volume;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a length of cuboid:");
		l=sc.nextFloat();
		System.out.println("Enter a breadth of cuboid:");
		b=sc.nextFloat();
		System.out.println("Enter a height of cuboid:");
		h=sc.nextFloat();

		SurfaceArea=2*(l*b+l*h+b*h);
		Volume=l*b*h;

		System.out.println("Surface area of cuboid:"+SurfaceArea);
		System.out.println("Surface Volume of cuboid:"+Volume);
	}
}