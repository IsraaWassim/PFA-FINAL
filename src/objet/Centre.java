package objet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="centre")
public class Centre {
	
	@Id	
	@GeneratedValue
	int id;
	String description;
	String surface;
	String prix;
	String ville;
    String rue;
    String code;
	String statut;
	
	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="idProprietaire")
		Proprietaire proprietaire;
	    
		public int getIdProprietaire() {
			return proprietaire.getIdProprietaire();
		}
		

		public Proprietaire getProprietaire() {
			return proprietaire;
		}






		public void setProprietaire(Proprietaire proprietaire) {
			this.proprietaire = proprietaire;
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


	public String getStatut() {
		return statut;
	}


	public void setStatut(String statut) {
		this.statut = statut;
	}


	public Centre(String description, String surface, String prix,String ville, String rue, String code, String statut) {
		super();
		this.description = description;
		this.surface = surface;
		this.prix = prix;
		this.ville = ville;
		this.rue = rue;
		this.code = code;
		this.statut = statut;
	}


	public Centre() 
	{
		super();

	}
	}
