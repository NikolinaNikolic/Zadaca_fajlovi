
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Zadatak4 {

	public static void main(String[] args) throws IOException {
	/* Napisati program koji kao argument prima ime filea. U fileu – jedna linija, jedna rečenica. Ispisati sve rečenice iz filea u obrnutom redosljedu
riječi. (Npr. ukoliko je prva rečenica u fileu “Hello World“ program treba da ispiše “World Hello“)
*/

		Scanner unos=new Scanner(System.in);

		 System.out.println("Unesite ime ");
			String ime = unos.next();
		
		FileReader fajl=new FileReader("rijeci.txt");
        BufferedReader br=new BufferedReader(fajl);
        String naopako;
        
       
 
        ArrayList<String> rijeci = new ArrayList<>();
        do{
        naopako = br.readLine();
        rijeci.add(naopako);
        }
        while(naopako!=null);
    
 
        for(int i=rijeci.size()-1;i>=0;i--) {
        System.out.println(rijeci.get(i));
        }
        unos.close();
        br.close();
        
    }
}


