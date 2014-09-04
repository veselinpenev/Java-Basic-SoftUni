import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int number=scan.nextInt();
		int count=0;
		String len=Integer.toBinaryString(number);
		number=Math.abs(number);
		if (number==0) {
			System.out.println(0);
		}
		else{
			for (int i = 0; i < len.length(); i++) {
				if(((number&1)==1&&((number>>1)&1)==1)||((number&1)==0&&((number>>1)&1)==0)){
					count++;
				}
				number=number>>1;
				
			}
			System.out.println(count);
		}
	}

}
