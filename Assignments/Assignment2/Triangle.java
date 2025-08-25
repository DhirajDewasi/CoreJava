import java.util.Scanner;
	public class Triangle{
		public static void main(String[] args){
			int s1,s2,s3;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter three side of triangle:");
			s1=sc.nextInt();
			s2=sc.nextInt();
			s3=sc.nextInt();
			if((s1+s2>s3)&&(s2+s3>s1)&&(s1+s3>s2))
				System.out.println("Triangle is valid");
			else
				System.out.println("Triangle is not valid");
}

}