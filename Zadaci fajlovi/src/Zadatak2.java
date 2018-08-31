import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) throws FileNotFoundException {
		/* . Napisati program koji pita korisnika da unese ime filea. Nakon što je korisnik unio ime filea, 
		 * program vraća koliko se puta koje slovo ponovilo u fileu. Program pravi razliku između velikih 
		 * i malih slova – to jeste, vraća koliko puta se ponovilo slovo 'a' i koliko se puta ponovilo slovo 'A'.
		*/

Scanner unos=new Scanner(System.in);

System.out.println("Unesite ime ");
	String ime = unos.nextLine();

FileReader file=new FileReader(ime); //slova.txt

Scanner input = new Scanner(file);

int velika = 0;
int mala=0;
while(input.hasNext()) {
	 String line=input.nextLine();

	for (int i = 0; i < line.length(); i++) {
		if(line.charAt(i) > 64 && line.charAt(i) < 91) 
			velika++;
		if(line.charAt(i) > 96 && line.charAt(i) < 123) 
			mala++;
	}

System.out.println("Velikih je"+velika);
System.out.println("Malih je"+mala);

}
}}