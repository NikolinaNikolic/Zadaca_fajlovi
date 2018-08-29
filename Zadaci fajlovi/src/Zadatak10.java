import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Zadatak10 {

	public static void main(String[] args) throws FileNotFoundException {
		/* Napisati program koji učitava neodređen broj brojeva iz filea te ispisuje samo neparne brojeve. 
		 * File možete nasumičpno generisati.
		 */
		Scanner unos=new Scanner(System.in);
		java.io.File file=new java.io.File("brojevi.txt");
		

		java.io.PrintWriter output=new java.io.PrintWriter(file);
		

		Scanner input = new Scanner(file);
	

			for(int i=0;i<100;i++) {
				int broj = (int) (Math.random() * 101);
					  output.print(broj + " ");
			}
			output.close();
						while (input.hasNext()) {
						int broj=input.nextInt();
					  if (broj%2==1) {
					System.out.println(broj);
				}
			}
		
		}}


