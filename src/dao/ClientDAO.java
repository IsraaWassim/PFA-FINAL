package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.Appartemment;
import objet.Client;

public class ClientDAO {
	
	Session session;
	SessionFactory sf;

	public ClientDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
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
	
	
	public void closeConnection()
	{
		session.close();
	}

}
