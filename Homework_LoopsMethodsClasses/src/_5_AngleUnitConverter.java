import java.util.Locale;
import java.util.Scanner;


public class _5_AngleUnitConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan=new Scanner(System.in);
		
		int test=scan.nextInt();
		scan.nextLine();
		for (int q = 0; q < test; q++) {
			String input=scan.nextLine();
			String[] mas=input.split(" ");
			if (mas[1].equals("deg")) {
				convertDeg(mas[0]);
			}
			else if(mas[1].equals("rad")){
				convertRad(mas[0]);
			}
		}

	}

	private static void convertRad(String string) {
		double degrees=Double.parseDouble(string);
		degrees=degrees*57.2957795;
		System.out.printf("%.6f deg \n",degrees);
		
	}

	private static void convertDeg(String string) {
		double radians=Double.parseDouble(string);
		radians=radians/360;
		radians=radians*(2*Math.PI);
		System.out.printf("%.6f rad \n",radians);
	}

}
