import java.util.Locale;
import java.util.Scanner;


public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		Scanner scan=new Scanner(System.in);
		double first=scan.nextDouble();
		double second=scan.nextDouble();
		double third=scan.nextDouble();
		double smallest=0;
		if (first<=second && first<=third) {
			smallest=first;			
		}
		else if (second<=first&& second<=third) {
			smallest=second;
		}
		else if(third<=first&&third<=second){
			smallest=third;
		}
		System.out.println(smallest);
	}

}
