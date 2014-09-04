import org.joda.time.DateTime;
import org.joda.time.Days;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class _7_DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String dateFirst=scan.nextLine();
		String dateSecond=scan.nextLine();
		try{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateTime dateF = new DateTime(simpleDateFormat.parse(dateFirst));
        DateTime dateS = new DateTime(simpleDateFormat.parse(dateSecond));
		int difference = Days.daysBetween(dateF, dateS).getDays();
        System.out.println(difference);
		}
		catch(Exception e){
			System.out.println(e);
		
		}
		
	}
}
