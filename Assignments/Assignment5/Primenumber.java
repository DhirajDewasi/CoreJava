import java.util.Scanner;
	public class Primenumber{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			int j;
			for (int i = 2; i <= n; i++) {
				
				for (j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					}
				}

				if (j == i) {
					System.out.print(i + " ");
				}
			}
		}
}