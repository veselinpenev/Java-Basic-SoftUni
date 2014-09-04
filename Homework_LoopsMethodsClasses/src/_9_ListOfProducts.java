import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class _9_ListOfProducts {

	public static void main(String[] args) {
		ArrayList<Products> product = new ArrayList<Products>();
		try(
				BufferedReader fileRead=new BufferedReader(new FileReader("9_input.txt"));
				FileWriter fileWrite=new FileWriter("9_output.txt")
			){
				while(true){
					String line=fileRead.readLine();
					if(line==null) break;
					String[] lineSplit=line.split(" ");
					product.add(new Products(lineSplit[0],Float.parseFloat(lineSplit[1])));
				}
				Collections.sort(product);
                for(Products pro : product){
                        fileWrite.write(String.format("%s %.2f \r\n",pro.getName(),pro.getPrice()));
                }
			}
		
			catch(FileNotFoundException ef){
				System.out.println("Error");
			}
			catch(IOException e){
				System.out.println(e);
			}

	}

}
