import java.util.Scanner;


public class _6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine();
		String mask=scan.nextLine();
		int count=0;
		String[] word=input.split("\\W+");
		for (int i = 0; i < word.length; i++) {
			word[i]=word[i].toLowerCase();
			if (word[i].equals(mask)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
