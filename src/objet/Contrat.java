package objet;

//import java.sql.Date;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="contrat")
public class Contrat {
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
	
	Date dateDeb;
	String nomc;
	String mailc ;
	String telc;
	String cinc;
	
	String nomp;
	String mailp ;
	String telp;
	String cinp;
	
	
	public String getNomc() {
		return nomc;
	}

	public void setNomc(String nomc) {
		this.nomc = nomc;
	}

	public String getMailc() {
		return mailc;
	}

	public void setMailc(String mailc) {
		this.mailc = mailc;
	}

	public String getTelc() {
		return telc;
	}

	public void setTelc(String telc) {
		this.telc = telc;
	}

	public String getCinc() {
		return cinc;
	}

	public void setCinc(String cinc) {
		this.cinc = cinc;
	}

	public String getNomp() {
		return nomp;
	}

	public void setNomp(String nomp) {
		this.nomp = nomp;
	}

	public String getMailp() {
		return mailp;
	}

	public void setMailp(String mailp) {
		this.mailp = mailp;
	}

	public String getTelp() {
		return telp;
	}

	public void setTelp(String telp) {
		this.telp = telp;
	}

	public String getCinp() {
		return cinp;
	}

	public void setCinp(String cinp) {
		this.cinp = cinp;
	}



	
	public Contrat(String description, Date dateSignature, Date dateDeb,
			String nomc, String mailc, String telc, String cinc, String nomp,
			String mailp, String telp, String cinp, Date dateFin) {
		super();
		this.description = description;
		this.dateSignature = dateSignature;
		this.dateDeb = dateDeb;
		this.nomc = nomc;
		this.mailc = mailc;
		this.telc = telc;
		this.cinc = cinc;
		this.nomp = nomp;
		this.mailp = mailp;
		this.telp = telp;
		this.cinp = cinp;
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

	public Contrat() 
	{
		super();

	}
}