import java.util.Scanner;


public class _7_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine().toLowerCase();
		String mask=scan.nextLine().toLowerCase();
		int count=0;
		boolean compare=true;
		String[] word=input.split("\\W+");
		for (int i = 0; i < word.length; i++) {
			for (int ch = 0; ch < word[i].length(); ch++) {
				for (int chMask = 0; chMask < mask.length(); chMask++){
					if (word[i].length()-ch<mask.length()) {
						compare=false;
						break;
					}
					else if(word[i].charAt(ch+chMask)!=mask.charAt(chMask)){
						compare=false;
						break;
					}
				}
				if (compare) {
					count++;
				}
				compare=true;
			}
		}
		System.out.println(count);
	
	}

}
