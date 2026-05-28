import java.util.Scanner;
public class AdditionOfMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2;
		
		System.out.println("Enter a Row Of First Matrix:");
		r1=sc.nextInt();
		System.out.println("Enter a Column Of First Matrix:");
		c1=sc.nextInt();
	
		System.out.println("Enter a Row Of Second Matrix:");
		r2=sc.nextInt();
		System.out.println("Enter a Column Of Second Matrix:");
		c2=sc.nextInt();

		if(!(r1==r2&&c1==c2)){
			System.out.println("Invalid Input");
			System.exit(0);
		}

		int a[][]=new int[r1][c1];

		System.out.println("Enter "+(r1*c1)+" element:");
		accept(a,r1,c1);

		int b[][]=new int[r2][c2];
		System.out.println("Enter "+(r2*c2)+"element:");
		accept(b,r2,c2);

		int add[][]=new int[r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of Matrix:");
		display(add,r1,c1);
	}

	public static void accept(int a[][],int r,int c){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}

	public static void display(int a[][],int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

	
}