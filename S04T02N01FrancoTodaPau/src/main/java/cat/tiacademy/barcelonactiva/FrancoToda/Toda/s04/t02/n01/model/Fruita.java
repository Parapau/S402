package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table //(name = "FRUITA")
public class Fruita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@SequenceGenerator(name="generadorFruita", sequenceName = "id", allocationSize=1)
	private long id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "QUANTITATQUILOS")
	private int quantitatQuilos;
	
	
	public Fruita() {}
	
	public Fruita(String nom, int quantitatQuilos) {
		//this.id = id;
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}

	
	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}


	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}



	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	
	
	@Override
	public String toString() {
		return "Id: " + this.getId() + "\nNom: " + this.getNom() + "\nPes: " + this.getQuantitatQuilos() + "kg\n\n";
	}
	
}
