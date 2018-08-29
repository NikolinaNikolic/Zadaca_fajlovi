import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws FileNotFoundException {
		/*Napisati program koji kao argument prima ime filea. Nakon što je korisnik unio ime filea, program prolazi kroz file te ispisuje rečenice iz filea
po sljedećim pravilima:
a. Ukoliko je dužina rečenice manja od 55 karaktera, ispisati rečenicu bez ikakvih promjena.
b. Ukoliko je dužina rečenice veća od 55 karaktera, promijeniti rečenicu na sljedeći način:
i. Smanjiti dužinu rečenice na 40 karaktera
ii. Dodati string ... <Read More> na kraj rečenice
iii. Ispisati promjenjenu rečenicu na konzoli
*/
		Scanner unos=new Scanner(System.in);
		
		 System.out.println("Unesite ime ");
			String ime = unos.nextLine();
	
		FileReader file=new FileReader("recenice.txt");
		
		Scanner input = new Scanner(file);
		
		String kraj="";
		

		  while(input.hasNextLine()){
			  String line=input.nextLine();
			  
		    if (line.length() < 55 ) {
		    
		    	System.out.println(line);
		     
		}
		   
		    else {
		    	for(int i=0;i<40;i++) {
		    		 kraj+= line.charAt(i);
				}
		    
				System.out.println(kraj+ "...Read More");
		    		 
		    	}
		    		
		    	}
		  input.close();
			unos.close();
		    }
		    	
		

	}


