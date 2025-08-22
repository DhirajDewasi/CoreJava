import java.util.Scanner;
 public class AreaCircumferenceOfCircle{
	public static void main(String[] args){
	Float r;
	double area,circumference;

     	Scanner sc=new Scanner(System.in);

	System.out.println("Enter a Radius of Circle:");
        r=sc.nextFloat();
     
        area=Math.PI*r*r;
        circumference=2*Math.PI*r;
      	System.out.println("Area is:"+area);
	System.out.println("CirCumference of Circle is:"+circumference);
   }
}