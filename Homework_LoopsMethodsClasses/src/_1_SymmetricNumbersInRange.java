import java.util.Scanner;


public class _1_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		for(int i=number1;i<=number2;i++){
			String num=Integer.toString(i);
			char[] number=num.toCharArray();
			int lenght=num.length();
			boolean simmetric=true;
			for (int j = 0; j < lenght/2; j++) {
				if(number[j]!=number[lenght-j-1]){
					simmetric=false;
					break;
				}
			}
			if (simmetric) {
				System.out.println(i);
			}
		}
	}

}