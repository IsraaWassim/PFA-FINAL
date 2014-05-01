package objet;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="proprietaire")
public class Proprietaire {
	@GeneratedValue
	@Id	
	int idProprietaire;
	String nom;
	String prenom;
	String cin;
	String mail;
	
	String tel;
	
	@OneToMany(mappedBy = "proprietaire")
	private List<Appartemment> appartements;
	
	
	public int getIdProprietaire() {
		return idProprietaire;
	}

	public void setIdProprietaire(int idProprietaire) {
		this.idProprietaire = idProprietaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Proprietaire(String nom, String prenom,String cin, String mail,
			String tel ) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.cin = cin;
	}

	public Proprietaire() 
	{
		super();

	}

	public List<Appartemment> getAppartements() {
		return appartements;
	}

	public void setAppartements(List<Appartemment> appartements) {
		this.appartements = appartements;
	}}