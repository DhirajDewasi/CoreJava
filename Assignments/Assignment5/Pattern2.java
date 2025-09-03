import java.util.Scanner;
	public class Pattern2{
		public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a row:");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++){

			for(int j=1;j<=i;j++){
				if(j<=i)
				System.out.print(6-j);
				else
				System.out.print(6-i);
			}
			System.out.println();
		}
	}
}