import java.util.Locale;
import java.util.Scanner;


public class PointsInsideTheHouse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		Scanner scan=new Scanner(System.in);
		
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		boolean inside=false;
		double line1=(17.5-12.5)*(y-8.5)-(3.5-8.5)*(x-12.5);
		double line2=(17.5-22.5)*(y-8.5)-(3.5-8.5)*(x-22.5);
		double line3=(22.5-12.5)*(y-8.5)-(8.5-8.5)*(x-12.5);
		if((line1==0 || line2==0 || line3==0)||(line1>0&& line2<0 && line3<0)){
			inside=true;
		}
		else if(x>=12.5 && x<=17.5&& y>=8.5&&y<=13.5){
			inside=true;
		}
		else if(x>=20 && x<=22.5&& y>=8.5&&y<=13.5){
			inside=true;
		}
		if (inside) {
			System.out.println("Inside");
		} 
		else {
			System.out.println("Outside");
		}
	}

}
