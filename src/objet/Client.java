package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
    @GeneratedValue
	@Id
	int id;
    String typeClient;
	String nom;
	String prenom;
	String cin;
	String mail;
	String tel;
	String Description;
	public Client() 
	{
		super();

	}

	public Client(String typeClient,  String nom,String prenom,String cin, String mail, String tel,String Description) {
		super();
		this.typeClient = typeClient;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.cin = cin;
		this.Description=Description;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTypeClient() {
		return typeClient;
	}




	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
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


	public String getCin() {
		return cin;
	}




	public void setCin(String cin) {
		this.cin = cin;
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


	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getDescription() {
		return Description;
	}






	}