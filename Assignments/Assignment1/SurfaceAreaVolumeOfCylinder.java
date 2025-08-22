import java.util.Scanner;
	public class SurfaceAreaVolumeOfCylinder{
	  	public static void main(String[] args){
		Float dimension,height,r;
		double surfacearea,volume;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a dimension of Cylinder:");
  		dimension=sc.nextFloat();
		System.out.println("Enter a Height of Cylinder:");
		height=sc.nextFloat();
		System.out.println("Enter a radius of Cylinder:");
		r=sc.nextFloat();

		surfacearea=2*Math.PI*r*r+2*Math.PI*r*height;
		volume=Math.PI*r*r*height;
		System.out.println("Surface Area is:"+surfacearea);
		System.out.println("Volume is:"+volume);
	}
}