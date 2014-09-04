import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int input=scan.nextInt();
		String hex = Integer.toHexString(input);
		System.out.println(hex.toUpperCase());

	}

}
