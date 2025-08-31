import java.util.Scanner;
	public  class CountOfFactor{
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			int cnt=0;
			System.out.println("Factor:");

			for(int i=1;i<=n;i++){
				if(n%i==0){
					System.out.println(i);
					cnt++;
				}
			}
			System.out.println("Factor count:"+cnt); 
	}
}