package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Fruita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String nom;
	
	@Column
	private int preu;
	
	@Column
	private int pes;
	
	
	public Fruita() {}
	
	public Fruita(String nom, int preu, int pes) {
		//this.id = id;
		this.nom = nom;
		this.preu = preu;
		this.pes = pes;
	}

	
	public long getId() {
		return id;
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
		return "Id: " + this.getId() + "\nNom: " + this.getNom() + "\nPreu: " + this.getPreu() + "\nPes: " + this.getPes() + "kg\n\n";
	}
	
}
