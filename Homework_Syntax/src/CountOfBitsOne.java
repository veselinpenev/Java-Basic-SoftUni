import java.math.BigDecimal;
import java.util.Formatter.BigDecimalLayoutForm;
import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int count=0;
		if(a<0){
			count++;
		}
		a=Math.abs(a);
		for (int i = 0; i < 32; i++) {
			if((a&1)==1){
				count++;
			}
			a=a>>1;
		}
		System.out.println(count);
	}

}
