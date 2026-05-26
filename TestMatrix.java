import java.util.Scanner;
public class TestMatrix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r,c;
		System.out.println("Enter a Row:");
		r=sc.nextInt();
		System.out.println("Enter a Column:");
		c=sc.nextInt();
		
		int a[][]=new int[r][c];

		accept(a,r,c,sc);
		display(a,r,c);

	}
	public static void accept(int a[][],int r,int c,Scanner sc){
		System.out.println("Enter Matrix Elements:");
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