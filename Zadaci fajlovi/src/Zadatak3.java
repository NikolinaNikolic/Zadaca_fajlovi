import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {
	/*Napisati program koji pita korisnika da unese neki string. Kada korisnik unese string, program sprema isti string u file te ispisuje korisniku sve
stringove iz filea naopako. 
*/

		
		
		Scanner unos=new Scanner(System.in);
		java.io.File file=new java.io.File("naopako.txt");

		java.io.PrintWriter output=new java.io.PrintWriter(file);
		
		   System.out.print("Unesite neku rijec");
		          String rijec=unos.nextLine();

		         
		         String naopako="";
		         
		         System.out.println("Naopako stringovi uneseni u file: ");
		    for(int i=rijec.length()-1; i>=0; i--) {
		        naopako= naopako + rijec.charAt(i);
		        
		    }
		    output.print(naopako + " ");
		    System.out.println(naopako);
		    unos.close();
		    output.close();
	}
	

}

