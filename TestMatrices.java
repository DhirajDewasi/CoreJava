import java.util.Scanner;
public class TestMatrices{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r1,r2,c1,c2;

		System.out.println("Enter a First Matrix row:");
		r1=sc.nextInt();
		System.out.println("Enter a First Matrix column: ");
		c1=sc.nextInt();
		int a[][]=new int[r1][c1];

		System.out.println("Enter a Second Matrix row:");
		r2=sc.nextInt();
		System.out.println("Enter a Second Matrix column:");
		c2=sc.nextInt();
		int b[][]=new int[r2][c2];

		System.out.println("Enter Elements Of First matrix");
		accept(a,r1,c1,sc);
		System.out.println("First Matrix :");
		display(a,r1,c1);
		System.out.println("Enter Elements Of Second matrix");
		accept(b,r2,c2,sc);
		System.out.println("Second Matrix :");
		display(b,r2,c2);


		
	}
	public static void accept(int a[][],int r,int c,Scanner sc){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
			}
		}	
	}
	public static void display(int a[][],int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.printf("%5d",a[i][j]);
			}
		System.out.println();
		}

	}
	
}
