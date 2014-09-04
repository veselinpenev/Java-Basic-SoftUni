import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String ln1=scan.nextLine().toLowerCase();
		String[] line1=ln1.split("\\W+");
		Integer maxCount=0;
		TreeMap<String,Integer> map=new TreeMap<>();
		for (String word : line1) {
		  Integer count = map.get(word);
		  if (count == null) {
		    count = 0; 
		  }
		  map.put(word, count+1);
		  if(count+1>maxCount){
			  maxCount=count+1;
		  }
		}
		for (String key : map.keySet()) {
			if(map.get(key)==maxCount){
				System.out.println(key + " -> "+map.get(key));
			}
		}
		

	}

}
