package dao;

import java.util.List;

import objet.Appartemment;
import objet.Centre;
import objet.Client;
import objet.HibernateUtil;
import objet.Proprietaire;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class AppartemmentDAO {

	Session session;
	SessionFactory sf;

	public AppartemmentDAO() {
		//session = HibernateUtil.getSessionFactory().openSession();

		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public Appartemment findAppartemment(Integer idAppartement){
		session.beginTransaction();
		return (Appartemment) session.get(Appartemment.class, idAppartement);
	}
	public void save(Appartemment a) {
		Transaction tr1 = session.beginTransaction();
		session.save(a);
		tr1.commit();
	}

	public void update(Appartemment a) {
		Transaction tr2 = session.beginTransaction();
		session.update(a);
		tr2.commit();
	}

	public void delete(Appartemment a) {
		Transaction tr3 = session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}

public List<Appartemment> getAllAppartement() {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Appartemment");
		List<Appartemment> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	

public List<Appartemment> getAllAppartemmentRecherche(String condition) {
//	ze
session.beginTransaction();
	Query query = session.createQuery("from Appartemment "+condition);
	List<Appartemment> list= query.list();
	System.out.println(list.toString());
	return list;

}


	public void closeConnection() {
		session.close();
	}

}
