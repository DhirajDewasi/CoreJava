import java.util.Scanner;
	public class PerformOperation{
		public static void main(String[] args){
			int x,y,op;
			
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter x:");
			x=sc.nextInt();
			System.out.println("Enter y:");
			y=sc.nextInt();

			System.out.println("Enter a operation(1.Equality, 2.Less Than,3.Quotient and Remainder,4.Range,5.Swap):");
			op=sc.nextInt();
		
			switch(op)
			{
				case 1:
					if(x==y)
					{
						System.out.println(x+" is equal to "+y);			
					}
					else
					{
						System.out.println(x+" is not equal to"+y);
					}
					break;
				case 2:
					if(x<y)
					{
						System.out.println(x+" is less than "+y);			
					}
					else
					{
						System.out.println(x+" is not less than"+y);
					}
					break;
				case 3:
					int quotient=x/y;
					int remainder=x%y;
					System.out.println("Quotient is"+quotient+" and remainder is "+remainder);
					break;
				case 4:
					System.out.println("Enter a number:");
					int n=sc.nextInt();
					
					if(n>=x&&n<=y)
					{
						System.out.println("The number lies between "+x+" and "+y);
					}
					else
					{
						System.out.println("The number didn't lies between "+x+" and "+y);
					}
					break;
				case 5:
					System.out.println("Before swap:");
					System.out.println("x:"+x+" y:"+y);
					

					int z=x;
					x=y;
					y=z;
					System.out.println("After Swap:");
					System.out.println("x:"+x+" y:"+y);
				default:
					System.out.println("Invalid option");
					
						
							
			}			
	}
}