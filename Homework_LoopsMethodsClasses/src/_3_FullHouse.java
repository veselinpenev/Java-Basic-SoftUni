
public class _3_FullHouse {
	public static void main(String[] args) {

		String[] card=new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" , "A"};
		char[] suits=new char[]{'\u2663','\u2666','\u2665','\u2660'};
		int counter=0;
		for (int threeCard = 0; threeCard < 13; threeCard++) {
			for (int twoCard = 0; twoCard < 13; twoCard++) {
				if(threeCard==twoCard){
					continue;
				}
				else{
					for (int s1 = 0; s1 < 4; s1++) {
						for (int s2 = s1+1; s2 < 4; s2++) {
							for (int s3 = s2+1; s3 < 4; s3++) {
								for (int s4 = 0; s4 < 4; s4++) {
									for (int s5 = s4+1; s5 < 4; s5++) {
										System.out.print("(");
										printCard(threeCard,s1);
										printCard(threeCard,s2);
										printCard(threeCard,s3);
										printCard(twoCard,s4);
										printCard5(twoCard,s5);
										System.out.print(") ");
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static void printCard5(int cardn, int sn) {
		String[] card=new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" , "A"};
		char[] suits=new char[]{'\u2663','\u2666','\u2665','\u2660'};
		System.out.printf("%s%c",card[cardn],suits[sn]);
		
	}

	private static void printCard(int cardn, int sn) {
		String[] card=new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" , "A"};
		char[] suits=new char[]{'\u2663','\u2666','\u2665','\u2660'};
		System.out.printf("%s%c ",card[cardn],suits[sn]);
	}

}
