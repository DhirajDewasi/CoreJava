import java.util.Scanner;
	public class PreviousAndNextCharacter{
		public static void main(String[] args){
		
			char  ch,next,prev;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a character:");
			ch=sc.next().charAt(0);
				
			next=ch;
			prev=ch;
			++next;
			--prev;
			System.out.println("Character is:"+ch);
			System.out.println("Next Character is:"+next);
			System.out.println("Previous Character is:"+prev);
	}
}