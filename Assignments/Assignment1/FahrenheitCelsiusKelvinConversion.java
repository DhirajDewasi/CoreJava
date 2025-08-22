import java.util.Scanner;
	public class  FahrenheitCelsiusKelvinConversion{
		public static void main(String[] args){
		Float fahren;
		double celsius,kelvin;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a temperature in Fahrenheit:");
		fahren=sc.nextFloat();
	
		celsius=(5.0/9.0)*(fahren-32);
		kelvin= celsius+273.15;
		System.out.println("Temp in Celsius:"+celsius);
		System.out.println("Temp in Kelvin:"+kelvin);	
}

}