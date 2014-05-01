package objet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contratVente")
public class ContratVente {
	@GeneratedValue
	@Id	
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String description;
	Date dateSignature;
	Float prix;
	public ContratVente(String description, Date dateSignature, Float prix) {
		super();
		this.description = description;
		this.dateSignature = dateSignature;
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateSignature() {
		return dateSignature;
	}
	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public ContratVente() 
	{
		super();

	}
}