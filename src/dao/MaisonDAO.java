package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.Appartemment;
import objet.Centre;
import objet.Maison;


public class MaisonDAO {
	
	Session session;
	SessionFactory sf;

	public MaisonDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public Maison findMaison(Integer id){
		session.beginTransaction();
		return (Maison) session.get(Maison.class, id);
	}
	public void save(Maison a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Maison a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Maison a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Maison> getAllMaison() {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Maison");
		List<Maison> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	public List<Maison> getAllMaisonRecherche(String condition) {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Maison "+condition);
		List<Maison> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	
	public void closeConnection()
	{
		session.close();
	}

}
