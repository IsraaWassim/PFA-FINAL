package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import objet.Appartemment;
import objet.Client;
import objet.Terrain;


public class TerrainDAO {
	
	Session session;
	SessionFactory sf;

	public TerrainDAO()
	{
		sf=new AnnotationConfiguration().configure().buildSessionFactory();
		session=sf.openSession();
	}
	public Terrain findterrain(Integer id){
		session.beginTransaction();
		return (Terrain) session.get(Terrain.class, id);
	}
	public void save(Terrain a)
	{
		Transaction tr1=session.beginTransaction();
		session.save(a);
		tr1.commit();
	}
	public void update(Terrain a)
	{
		Transaction tr2=session.beginTransaction();
		session.update(a);
		tr2.commit();
	}
	public void delete(Terrain a)
	{
		Transaction tr3=session.beginTransaction();
		session.delete(a);
		tr3.commit();
	}
	
	public List<Terrain> getAllTerrain() {
//		ze
	session.beginTransaction();
		Query query = session.createQuery("from Terrain");
		List<Terrain> list= query.list();
		System.out.println(list.toString());
		return list;

	}
	
	public void closeConnection()
	{
		session.close();
	}

}
