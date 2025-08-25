import java.util.Scanner;
	public class OperatorOperation{
		public static void main(String[] args){
			int n1,n2;
			char op;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 2 number:");
			n1=sc.nextInt();
			n2=sc.nextInt();
			System.out.println("Enter a operator(+,-,*,/):");
			op=sc.next().charAt(0);
			
			switch(op)
			{
				case '+':
					System.out.println("Addition:"+(n1+n2));
					break;
				case '-':
					System.out.println("Substraction:"+(n1-n2));
					break;
				case '*':
					System.out.println("Multiplication:"+(n1*n2));
					break;
				case '/':
					System.out.println("Division:"+(n1/n2));
					break;
				default:
					System.out.println("Invalid Operator");
					break;
		}
	}
}