import java.util.Scanner;
	public class CashierCurrency{
		public static void main(String[] args){
			int amount,ten,five,one;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a Amount:");
			amount=sc.nextInt();
			
			ten=amount/10;
			amount=amount%10;
			five=amount/5;
			amount=amount%5;
			one=amount;
		
			System.out.println("-------Currency Notes Needed-------");
			System.out.println("Ten:"+ten);
			System.out.println("Five:"+five);
			System.out.println("One:"+one);

}
}
