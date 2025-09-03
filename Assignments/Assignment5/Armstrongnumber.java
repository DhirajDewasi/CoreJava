import java.util.Scanner;
	public class Armstrongnumber{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Number:");
			int n = sc.nextInt();

      			for (int i = 1; i <= n; i++) {
				int number = i;
				int count = 0;
				double result = 0;

            
				int temp = number;
				while (temp > 0) {
					count++;
					temp /= 10;
				}

				temp = number;
				while (temp > 0) {
					int rem = temp % 10;
					result += Math.pow(rem, count);
					temp /= 10;
				}

           
				if (result == number) {
					System.out.println(number);
				}
			}

	}
}