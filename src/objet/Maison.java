package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="maison")
public class Maison {
	@GeneratedValue
	@Id	
	int id;
	String description;
	String surface;
    String prix;
    String ville;
    String rue;
    String code;
	String nbrChambre;
	String garage;
	String jardin;
	String statut;
	
	public Maison() 
	{
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNbrChambre() {
		return nbrChambre;
	}

	public void setNbrChambre(String nbrChambre) {
		this.nbrChambre = nbrChambre;
	}

	public String getGarage() {
		return garage;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}

	public String getJardin() {
		return jardin;
	}

	public void setJardin(String jardin) {
		this.jardin = jardin;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Maison(String description, String surface, String prix,String ville, String rue, String code, String nbrChambre,String garage, String jardin, String statut) {
		super();
		this.description = description;
		this.surface = surface;
		this.prix = prix;
		this.ville = ville;
		this.rue = rue;
		this.code = code;
		this.nbrChambre = nbrChambre;
		this.garage = garage;
		this.jardin = jardin;
		this.statut = statut;
	}


}