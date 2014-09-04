import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class _10_OrderOfProducts {

	public static void main(String[] args) {
		float sum=0;
		ArrayList<Products> product = new ArrayList<Products>();
		try(
				BufferedReader fileRead=new BufferedReader(new FileReader("10_input.txt"));
				BufferedReader fileOrder=new BufferedReader(new FileReader("10_order.txt"));
				FileWriter fileWrite=new FileWriter("10_output.txt")
			){
				while(true){
					String line=fileRead.readLine();
					if(line==null) break;
					String[] lineSplit=line.split(" ");
					product.add(new Products(lineSplit[0],Float.parseFloat(lineSplit[1])));
				}
				while(true){
					String line=fileOrder.readLine();
					if(line==null) break;
					String[] lineSplit=line.split(" ");
					for (Products pro : product) {
						if(pro.getName().equals(lineSplit[1])){
							sum+=pro.getPrice()*Float.parseFloat(lineSplit[0]);
						}
					}
				}
                fileWrite.write(String.format("%.2f ",sum));
                
			}
		
			catch(FileNotFoundException ef){
				System.out.println("Error");
			}
			catch(IOException e){
				System.out.println(e);
			}

	}

}
