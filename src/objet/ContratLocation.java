package objet;

//import java.sql.Date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contratLocation")
public class ContratLocation {
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
	Date dateDeb;
	public ContratLocation(String description, Date dateSignature, Float prix,
			Date dateDeb, Date dateFin) {
		super();
		this.description = description;
		this.dateSignature = dateSignature;
		this.prix = prix;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
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

	public Date getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	Date dateFin;

	public ContratLocation() 
	{
		super();

	}
}