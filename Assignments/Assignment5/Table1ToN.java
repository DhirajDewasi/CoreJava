import java.util.Scanner;
	public class Table1ToN{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a  number:");
			int n=sc.nextInt();
		

			
			int table,i,j;

			for(i=1;i<=10;i++){
				
				for(j=1;j<=n;j++){
					table=i*j;
					System.out.printf("\t"+j+"x"+i+"=" +table);
				}
				System.out.println();
			}
			
			
	}
}