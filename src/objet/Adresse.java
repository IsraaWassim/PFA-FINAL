package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="adresse")
public class Adresse {
	@GeneratedValue
	@Id	
	int id;
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	String ville;
	String rue;
	String codePostal;
	
	
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


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public Adresse(String ville, String rue, String codePostal) {
		super();
		this.ville = ville;
		this.rue = rue;
		this.codePostal = codePostal;
	}


	public Adresse() 
	{
		super();

	}
	
}