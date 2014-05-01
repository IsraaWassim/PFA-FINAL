package dao;

import java.util.List;

import objet.Appartemment;
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
//		sf = new AnnotationConfiguration().configure().buildSessionFactory();
//		session = sf.openSession();
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
//		Configuration config = new Configuration();
//		config.addClass(Appartemment.class);
//		config.addClass(Proprietaire.class);
//		config.configure();

//		SessionFactory sessionFactory = config.buildSessionFactory();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Session session1 = HibernateUtil.getSessionFactory().openSession();

		session1.beginTransaction();
		try {
			Query query = session1.createQuery("from Appartement");
			List<Appartemment> list= query.list();
			System.out.println(list.toString());
			return list;
		} finally {
			session1.close();
			sessionFactory.close();
		}

//		List<Appartemment> list = session.createQuery("from objet.Appartement")
//				.list();

	}

	/*
	 * public List<Adresse> getClient() { List<Client>
	 * l=session.createQuery("from objet.Client").list();
	 * System.out.println(l.get(1).getCin()+l.get(1).getNom()); return l; }
	 * 
	 * public List<Client> getClientById(int id) { List<Client>
	 * l=session.createQuery("from objet.Client where id="+id+" ").list();
	 * 
	 * return l;
	 * 
	 * }
	 * 
	 * public void updateClient(int id,String nom) {
	 * 
	 * Transaction tf=session.beginTransaction(); org.hibernate.Query
	 * q1=session.
	 * createQuery("update objet.Client set nom='"+nom+"'  where id='"+id+"'");
	 * int rowCount = q1.executeUpdate(); System.out.println("Rows affected: " +
	 * rowCount); tf.commit();
	 * 
	 * }
	 */

	public void closeConnection() {
		session.close();
	}

}