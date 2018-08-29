import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) throws FileNotFoundException {
/*. Napisati program koji čita rečenice iz filea i vraća svaku riječ u rečenicu sa početnim velikim  
 * slovom. Da li će program da prima ime filea kao argument ili ne, na vama je. (Rečenica “Hello world“
 *  u outputu treba biti pretvorena u “Hello World“)

*/
		FileReader file=new FileReader("velika_slova.txt");
		
	
			Scanner input = new Scanner(file);
		
			
			while (input.hasNext()) {
				String line=input.nextLine();
			
				for(int i=0;i<line.length();i++) {
				
					char c=Character.toUpperCase(line.charAt(0));
					line=c+line.substring(1);
			
					       if(line.charAt(i)==' ') {
					        
					            c=Character.toUpperCase(line.charAt(i+1));
					            line=line.substring(0, i) + " "+ c + line.substring(i+2);
					        }
			
					   }
			
				 System.out.println(line);	
				}
				 
		}
		}

	

		

	


