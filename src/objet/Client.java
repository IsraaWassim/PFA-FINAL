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
    String typeBien;
	String nom;
	String prenom;
	String cin;
	String mail;
	String tel;
	
	

	

	public Client() 
	{
		super();

	}




	public Client(String typeClient, String typebien, String nom,String prenom,String cin, String mail, String tel) {
		super();
		this.typeClient = typeClient;
		this.typeBien = typebien;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.cin = cin;
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




	public String getTypebien() {
		return typeBien;
	}




	public void setTypebien(String typebien) {
		this.typeBien = typebien;
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




	}