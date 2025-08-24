import java.util.Scanner;
	public class ASCIIValue{
		public static void main(String[] args){
			char ch;
			int Ascii;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a character:");
			ch=sc.next().charAt(0);
			Ascii=(int) ch;
			System.out.println("Ascii value of "+ch+" is:"+Ascii);
			
	}
}