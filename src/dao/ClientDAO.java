package dao;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.Appartemment;
import objet.Client;
import objet.Proprietaire;

public class ClientDAO {
	private DefaultComboBoxModel aModel;
	Session session;
	SessionFactory sf;
	

	public ClientDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public Client findClient(Integer id){
		session.beginTransaction();
		return (Client) session.get(Client.class, id);
	}
	public void save(Client a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Client a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Client a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Client> getAllClient() {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Client");
		List<Client> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	
	public void remplirComboBox()
	{
		aModel=new DefaultComboBoxModel();
		List<Client> l=session.createQuery("from Client").list();
		aModel.addElement("");
		try {
	     
		      for(Object obj : l)
		      {
		    	  Client prop =(Client)obj ;
		    	  aModel.addElement(prop.getNom()+" "+prop.getPrenom());
		    	  
		      }
		    } 
		    finally 
		    {
		      session.close();
		    }
		   
	}

	public void closeConnection()
	{
		session.close();
	}
	public Client getprop(String nomPrenom) {
	Client prop = new Client();	
	
	session.beginTransaction();
	
	Query query = session.createQuery("from Client p where p.nom and p.prenom = :nom ");
	query.setString("nom",nomPrenom);
	
	//List<Client> list= query.list();
	List list = query.list();
	if(list.size()!=0)
		
	{
		Client p=(Client) list.get(0);
		prop.setCin(p.getCin());
		prop.setMail(p.getMail());
		prop.setTel(p.getTel());
		
	}
	return prop;
		
	}
	public DefaultComboBoxModel getaModel() {
		return aModel;
	}
	public void setaModel(DefaultComboBoxModel aModel) {
		this.aModel = aModel;
	}

}
