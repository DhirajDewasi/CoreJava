import java.util.Scanner;
	public class Pattern10{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a row:");
			int n=sc.nextInt();

			for(int i=n;i>=1;i--){

				for(int k=n;k>i;k--){

					System.out.print(" ");
				}
					for(int j=1;j<=i;j++){
						if(i==n||j==1||j==i)
							System.out.print("* ");
						else
							System.out.print("  ");
					}
					System.out.println();
			}
			
	}
}