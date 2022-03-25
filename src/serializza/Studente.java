package serializza;

import java.io.Serializable;

public class Studente implements Serializable {
	private String cognome, nome, classe;
	int voto;

	public Studente(String cognome, String nome, String classe, int voto) {
		this.nome = nome;
		this.cognome = cognome;
		this.classe = classe;
		this.voto = voto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return cognome + "," + nome + "," + classe + "," + voto;
	}

}
