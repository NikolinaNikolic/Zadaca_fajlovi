import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Zadatak1 {

	public static void main(String[] args) throws FileNotFoundException {
		/*1. Napisati program koji kao argument prima ime filea te:
a. vraća broj karaktera u datom fileu
b. vraća broj riječi u datom fileu
c. vraća broj linija teksta u datom fileu
Riječi su razdvojene jednim spaceom. 
*/
		java.io.File file=new java.io.File("dokument.txt");
		
		int brojac_karaktera=0;
		int brojac_rijeci=0;
		int brojac_linija=0;
		
Scanner unos=new Scanner(file);

while (unos.hasNextLine()) {
    brojac_linija++;

	String line=unos.nextLine();

	
		for(int i=0;i<line.length();i++) {
			if(Character.isLetter(line.charAt(i))) {
				brojac_karaktera++;
			}
		
	}
	
		
				
				try(Scanner input = new Scanner(new FileInputStream(file))){
				   
				    while(input.hasNext()){
				        input.next();
				        brojac_rijeci++;
				    }
				}
}
				System.out.println("Broj karaktera je " +brojac_karaktera);
			    System.out.println("Broj rijeci je " + brojac_rijeci);
				System.out.println("Broj linija je " +brojac_linija);
				}

	}
		


	


