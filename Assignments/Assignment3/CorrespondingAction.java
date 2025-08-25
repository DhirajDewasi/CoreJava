import java.util.Scanner;
	public class CorrespondingAction{
		public static void main(String[] args){
			int r,op;
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a radius:");
			r=sc.nextInt();

			System.out.println("Enter a option:");
			System.out.println("1.Area of Circle");
			System.out.println("2.Circumference of Circle");
			System.out.println("3.Volume of Sphere");
			op=sc.nextInt();
		
			switch(op)
			{
				case 1:
					double area=Math.PI*r*r;
					System.out.println("Area of circle:"+area);
				break;

				case 2:
					double circumference=2*Math.PI*r;
					System.out.println("Circumference of Circle:"+circumference);
				break;
				
				case 3:
					double volume=(4/3)*Math.PI*r*r*r;
					System.out.println("Volume of Sphere:"+volume);
				break;
				
				default:
					System.out.println("Invalid operation");
				break;
			}
			
	}
}