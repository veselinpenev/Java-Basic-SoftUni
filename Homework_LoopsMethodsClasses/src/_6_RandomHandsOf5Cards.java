
import java.util.Random;
import java.util.Scanner;


public class _6_RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int test=scan.nextInt();
		for (int i = 0; i < test; i++) {
			Random r= new Random();
			int[] card=new int[5];
			int[] suite=new int[5];
			for (int j = 0; j < card.length; j++) {
				boolean mask=true;
				while(mask){
					mask=false;
					int randomCard=r.nextInt(12);
					int randomSuite=r.nextInt(4);
					for (int j2 = 0; j2 < card.length; j2++){
						if(randomCard==card[j2]&&randomSuite==suite[j2]){
							mask=true;
						}
					}
					if(mask==false){
						card[j]=randomCard;
						suite[j]=randomSuite;
						printCard(randomCard,randomSuite);
					}
				}
			}
			System.out.println();
			
		}

	}

	private static void printCard(int i, int j) {
		String[] card=new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" , "A"};
		char[] suits=new char[]{'\u2663','\u2666','\u2665','\u2660'};
		System.out.printf("%s%c ",card[i],suits[j]);
	}

}
