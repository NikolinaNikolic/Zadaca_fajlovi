import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) throws FileNotFoundException {
		// Napisati program koji prima kao argument ime filea. Nakon što je program učitao file, nalazi
		//najdužu riječ u svakoj liniji teksta te ispisuje istu	korisniku
		
		  new Zadatak6().getLongestWords();
	 }
	public void getLongestWords() throws FileNotFoundException {
Scanner unos=new Scanner(System.in);
System.out.println("Unesite ime fajla ");
String ime = unos.next();

	    String najduza = "";
	    String current;

		FileReader file=new FileReader(ime); //najduza.txt

		 ArrayList<String> lista = new ArrayList<>();
		 Scanner input=new Scanner(file);
		 
	    while (input.hasNext()) {
	        current = input.next();
	        lista.add(current);
	        
	        for(int i=0; i<lista.size();i++) {
	        if (current.length() > najduza.length()) {
	            najduza = current;
	        }
	      
	    }
	    System.out.println(najduza);
	           
	        }
	
	input.close();

	}}


	


