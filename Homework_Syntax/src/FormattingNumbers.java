import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		String hex = Integer.toHexString(a).toUpperCase();
		String bin=String.format("%10s", Integer.toBinaryString(a));
		bin=bin.replace(' ', '0');
		System.out.printf("|%-10s|%-10s|%10.2f|%-10.3f|",hex,bin,b,c);

	}

}
