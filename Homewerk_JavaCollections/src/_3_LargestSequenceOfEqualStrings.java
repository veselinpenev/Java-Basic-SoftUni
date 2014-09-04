import java.util.Scanner;


public class _3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine();
		String[] word=input.split(" ");
		int index=0;
		int count=1;
		int maxLenght=0;
		String maxWord="";
		String selectWord="";
		while(true){
			for (int i = index; i < word.length; i++) {
				if (i==word.length-1) {
					index=i+1;
					selectWord=word[i];
					break;
				}
				else if(word[i].equals(word[i+1])){
						count++;
				}
				else{
					index=i+1;
					selectWord=word[i];
					break;
				}
			}
			if (maxLenght<count) {
				maxLenght=count;
				maxWord=selectWord;
			}
			if(index==word.length){
				break;
			}
			count=1;
		}
		for (int i = 0; i < maxLenght; i++) {
			System.out.print(maxWord+" ");
		}

	}

}
