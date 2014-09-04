import java.util.Scanner;


public class _4_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String input=scan.nextLine();
		String[] word=input.split(" ");
		int startIndex=0;
		int maxLenght=0;
		int count=1;
		String maxWord="";
		String selectWord="";
		int[] numbers=new int[word.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=Integer.parseInt(word[i]);
		}
		while(true){
			for (int i = startIndex; i < word.length; i++) {
				if (i==word.length-1) {
					selectWord=selectWord+ numbers[i]+" ";
					startIndex=i+1;
					break;
				}
				else if(numbers[i]<numbers[i+1]){
						selectWord=selectWord+ numbers[i]+" ";
						count++;
				}
				else{
					selectWord=selectWord+ numbers[i]+" ";
					startIndex=i+1;
					break;
				}
			}
			if (maxLenght<count) {
				maxLenght=count;
				maxWord=selectWord;
			}
			System.out.println(selectWord);
			
			if(startIndex==word.length){
				break;
			}
			count=1;
			selectWord="";
		}
			System.out.print("Longest: "+maxWord);
		
	}

}
