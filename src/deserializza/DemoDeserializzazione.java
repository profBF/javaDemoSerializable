package deserializza;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import serializza.Studente;

public class DemoDeserializzazione {

	@SuppressWarnings("unchecked")
	public static List<Studente> deserializza() {
		ObjectInputStream ois = null;
		List<Studente> elenco = new ArrayList<>();
		try {
			ois = new ObjectInputStream(new FileInputStream("studenti.bin"));
			elenco = (ArrayList<Studente>)ois.readObject();
			System.out.println("Elenco studenti recuperato dal file studenti.bin");
			return elenco;
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Errore nell'apertura del file");
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				System.out.println("Errore nella chiusura del file");
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		List<Studente> elenco = deserializza();
		for ( Studente s : elenco) {
			System.out.println(s);
		}

	}

}
