
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		

		Scanner unos=new Scanner(System.in);
		
		 System.out.println("Unesite ime fajla ");  //predzadnja.txt
			String ime = unos.next();
		
		FileReader file=new FileReader(ime);

		
		  ArrayList<String> lista = new ArrayList<>();
		Scanner input = new Scanner(file);
		String predzadnja="";
		
		while (input.hasNextLine()) {
			String line=input.nextLine();
			lista.add(line);
	
			for(int i=0;i<lista.size();i++) {
				 String[] words = line.split("[ ]+");
			predzadnja=words[words.length - 2];
				

			}
			 System.out.println("Predzadnja rijec je: "+predzadnja);
			
		}

		input.close();
     unos.close();
  
		 }	
}
	
	


