import java.util.Scanner;
	public class Pattern5{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a number of rows:");
			int n=sc.nextInt();

			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if(j<=i)
					System.out.print(6 -j);
					else
					System.out.print(6 -i);
				}
				System.out.println();
			}


	}

}