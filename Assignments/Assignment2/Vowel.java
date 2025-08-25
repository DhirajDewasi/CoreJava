import java.util.Scanner;
	public class Vowel{
		public static void main(String[] args){
			char ch;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a  lower case character:");
			ch=sc.next().charAt(0);
			if(ch>='a'&&ch<='z')
			{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println(ch+"is Vowel");
			else 
				System.out.println(ch+"is not vowel");	
			}
			else
			{
				System.out.println("Character is invalid");
			}
	}
}