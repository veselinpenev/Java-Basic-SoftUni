import java.util.Scanner;


public class _2_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine();
		char[] letter=input.toCharArray();
		int length=letter.length;
		for (int let1 = 0; let1 < length; let1++) {
			for (int let2 = 0; let2 < length; let2++) {
				for (int let3 = 0; let3 < length; let3++) {
					String word=""+letter[let1]+letter[let2]+letter[let3]+" ";
					System.out.print(word);
				}
			}
		}
	}

}
