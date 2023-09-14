package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.repository;

import jakarta.persistence.Entity;

@Entity
public class Fruita {
	
	private String nom;
	private int preu, pes;
	
	
	public Fruita(String nom, int preu, int pes) {
		super();
		this.nom = nom;
		this.preu = preu;
		this.pes = pes;
	}


	public String getNom() {
		return nom;
	}


	public int getPreu() {
		return preu;
	}


	public int getPes() {
		return pes;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPreu(int preu) {
		this.preu = preu;
	}


	public void setPes(int pes) {
		this.pes = pes;
	}
	
	
	@Override
	public String toString() {
		return "Nom: " + this.getNom() + "\nPreu: " + this.getPreu() + "\nPes: " + this.getPes() + "kg\n\n";
	}
	
}
