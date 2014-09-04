import java.util.ArrayList;
import java.util.Scanner;


public class _9_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String ln1=scan.nextLine().toLowerCase();
		String ln2=scan.nextLine().toLowerCase();
		boolean compare=true;
		String[] line1=ln1.split(" ");
		String[] line2=ln2.split(" ");
		ArrayList<Character> sequence=new ArrayList<>();
		for (int i = 0; i < line1.length; i++) {
			sequence.add(line1[i].charAt(0));
		}
		for (int i = 0; i < line2.length; i++) {
			for (int j = 0; j < line1.length; j++) {
				if(line2[i].charAt(0)==line1[j].charAt(0)){
					compare=false;
					break;
				}
			}
			if (compare) {
				sequence.add(line2[i].charAt(0));
			}
			compare=true;
		}
		for (int i = 0; i < sequence.size(); i++) {
			System.out.print(sequence.get(i)+" ");
		}
	}

}
