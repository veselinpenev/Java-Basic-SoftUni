import java.util.Scanner;


public class _8_ExtractEmails {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine().toLowerCase();
		String[] word=input.split(" ");
		String copy="";
		String regex="([A-Z0-9a-z]+[.-_]*[A-Z0-9a-z]+)+[@]{1}([a-z]+[.]+[a-z]+[ ]*)+";
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word[i].length(); j++) {
				if(j==word[i].length()-1&& word[i].charAt(j)=='.'){
					break;
				}
				else{
					copy=copy+word[i].charAt(j);
				}
			}
			if(copy.matches(regex)){
				System.out.println(copy);
			}
			copy="";
		}

	}

}
