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
	Session session;
	SessionFactory sf;

	public ClientDAO() {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
		session = sf.openSession();
	}

	public Client findClient(Integer id) {
		session.beginTransaction();
		return (Client) session.get(Client.class, id);
	}

	public void save(Client a) {
		Transaction tr1 = session.beginTransaction();
		session.save(a);
		tr1.commit();
	}

	public void update(Client a) {
		Transaction tr2 = session.beginTransaction();
		session.update(a);
		tr2.commit();
	}

	public void delete(Client a) {
		Transaction tr3 = session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}

	public List<Client> getAllClient() {
		session.beginTransaction();
		Query query = session.createQuery("from Client");
		List<Client> list = query.list();
		return list;

	}


	public void closeConnection() {
		session.close();
	}


}
