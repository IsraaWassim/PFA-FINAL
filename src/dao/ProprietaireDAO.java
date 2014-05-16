package dao;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.Client;
import objet.Proprietaire;


public class ProprietaireDAO {
	
	Session session;
	SessionFactory sf;

	public ProprietaireDAO()
	
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public void save(Proprietaire a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Proprietaire a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Proprietaire a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Proprietaire> getAllProprietaire() {

	session.beginTransaction();
		Query query = session.createQuery("from Proprietaire");
		List<Proprietaire> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	
	
	public void closeConnection()
	{
		session.close();
	}

}
