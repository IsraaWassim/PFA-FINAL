package dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.CentreCommercial;


public class CentreCommercialDAO {
	
	Session session;
	SessionFactory sf;

	public CentreCommercialDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(CentreCommercial a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(CentreCommercial a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(CentreCommercial a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	/*public List<Adresse> getClient()
	{
		List<Client> l=session.createQuery("from objet.Client").list();
		System.out.println(l.get(1).getCin()+l.get(1).getNom());
		return l;
	}
	
	public List<Client> getClientById(int id)
	{
		List<Client> l=session.createQuery("from objet.Client where id="+id+" ").list();
		
		return l;
		
	}
	
	public void updateClient(int id,String nom)
	 {

	Transaction tf=session.beginTransaction();
	org.hibernate.Query q1=session.createQuery("update objet.Client set nom='"+nom+"'  where id='"+id+"'");
	int rowCount = q1.executeUpdate();
	System.out.println("Rows affected: " + rowCount);
	tf.commit();

	 }
	*/
	
	public void closeConnection()
	{
		session.close();
	}

}
