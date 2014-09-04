import java.util.Scanner;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String ln1=scan.nextLine().toLowerCase();
		String[] line1=ln1.split("\\W+");
		TreeSet<String> set=new TreeSet<>();
		for (int i = 0; i < line1.length; i++) {
			set.add(line1[i]);
		}
		set.stream().forEach(x-> System.out.print(x +" "));

	}

}
