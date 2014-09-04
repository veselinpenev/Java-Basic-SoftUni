import java.util.Scanner;


public class _5_CountAllWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine();
		String[] word=input.split("\\W+");
		System.out.println(word.length);

	}

}
