import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader file=new FileReader("razmak.txt");
	//	 BufferedReader br=new BufferedReader(file);

		
		Scanner input = new Scanner(file);
	
		
		while (input.hasNext()) {
			String line=input.nextLine();
		
			for(int i=0;i<line.length();i++) {
	            line = line.trim();
	            line=line.replaceAll("\\s+","");
	           
	        
				
			}
			 System.out.println(line);
	}
	}

}
	

