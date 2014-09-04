import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String ln1=scan.nextLine();
		String[] line1=ln1.split("\\W+");
		HashMap<String,Double> map=new HashMap<>();
		for (String word : line1) {
		  Double count = map.get(word);
		  if (count == null) {
		    count = 0.0; 
		  }
		  map.put(word, count+1);
		  
		}
		for (int i = 0; i < line1.length; i++) {
			for (String key : map.keySet()) {
				if(line1[i].charAt(0)==key.charAt(0)){
					double percent=(map.get(key)*100)/line1.length;
					System.out.printf("%s -> %.2f",key,percent);
					System.out.println("%");
					map.remove(key);
					break;
				}
			}
		}
	}

}
