import java.util.Scanner; 
	public class LowercaseIntoUppercase{
		public static void main(String[] args) {
			char ch; 
			char upper;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Character:");
			ch=sc.next().charAt(0);
        		if (ch >= 'a' && ch <= 'z') 
			{
            		 upper = (char)(ch - 32);
            		System.out.println("Uppercase: " + upper);
			} 
			else
			{
            System.out.println("Not a lowercase letter.");
        }
    }
}