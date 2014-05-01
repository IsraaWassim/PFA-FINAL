package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="centreCommercial")
public class CentreCommercial {
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
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public CentreCommercial(String description, String prix, String ville,String rue, String code, String surface, String statut) {
		super();
		this.description = description;
		this.prix = prix;
		this.ville = ville;
		this.rue = rue;
		this.code = code;
		this.surface = surface;
		this.statut = statut;
	}
	@GeneratedValue
	@Id	
	int id;
	String description;
	String prix;
	String ville;
    String rue;
    String code;
	String surface;
	String statut;
}