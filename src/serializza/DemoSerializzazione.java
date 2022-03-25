package serializza;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerializzazione {

	public static void serializza(List<Studente> lista ) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("studenti.bin"));
			oos.writeObject(lista);
			System.out.println("Elenco studenti salvato nel file studenti.bin");
		} catch (IOException e) {
			System.out.println("Errore in scrittura file");
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				System.out.println("Errore nella chiusura del file");
			}
		}
	}
	
	
	public static void main(String[] args) {
		List<Studente> elenco = new ArrayList<>(); 
		
		elenco.add(new Studente("Rossi", "Mario", "4AIN",6));
		elenco.add(new Studente("Verdi", "Paolo", "3AIN",7));
		elenco.add(new Studente("Neri", "Monica", "4AIN",8));
		elenco.add(new Studente("Frangi", "Palle", "3AIN",5));
		
		serializza(elenco);
		
	}

}
