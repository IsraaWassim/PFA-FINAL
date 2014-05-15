package dao;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.Centre;
import objet.Terrain;


public class CentreDAO {
	
	Session session;
	SessionFactory sf;
	

	public CentreDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public Centre findCentre(Integer id){
		session.beginTransaction();
		return (Centre) session.get(Centre.class, id);
	}
	public void save(Centre a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Centre a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Centre a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Centre> getAllCentre() {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Centre");
		List<Centre> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	
	public List<Centre> getAllCentreRecherche(String condition) {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Centre "+condition);
		List<Centre> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	
	

	public void closeConnection()
	{
		session.close();
	}
	

}
