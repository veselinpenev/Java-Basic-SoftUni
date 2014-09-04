import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class _8_SumNumbersFromATextFile {

	public static void main(String[] args) {
		ArrayList<Integer> numb=new ArrayList<Integer>();
		int sum=0;
		try(
			BufferedReader fileRead=new BufferedReader(new FileReader("8_input.txt"));
		){
			while(true){
				String line=fileRead.readLine();
				if(line==null) break;
				numb.add(Integer.parseInt(line));
			}
		}
	
		catch(FileNotFoundException ef){
			System.out.println("Error");
		}
		catch(IOException e){
			System.out.println(e);
		}
		for (Integer i : numb) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
