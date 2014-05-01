package objet;




import java.util.*;

import javax.swing.table.AbstractTableModel; 

import dao.AppartemmentDAO;

public class TableModel extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<Appartemment> appartemmentList;

    public TableModel()
    {
        super();
        AppartemmentDAO appartemmentDAO = new AppartemmentDAO();
        appartemmentList = appartemmentDAO.getAllAppartement();
//        SessionFactory sf=new Configuration().configure().buildSessionFactory();
//        Session session=sf.openSession();
//
//        Query q=session.createQuery("from objet.Proprietaire");
//        ProprietaireList=new ArrayList<Proprietaire>(q.list());
        //System.out.println("cccccccccccccccccccccccc" + ProprietaireList.size());
//        session.close();
//        sf.close();
       // ProprietaireList=(ArrayList<Proprietaire>) new ProprietaireDAO().getClient();
    }

    public int getRowCount()
    {
        return appartemmentList.size();
    }

    public int getColumnCount()
    {
        return 11;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Appartemment p=appartemmentList.get(rowIndex);
        Object[] values=new Object[]{p.getProprietaire(),p.getDescription(),p.getPrix(),p.getVille(),p.getRue(),p.getCode(),p.getAscenseur(),p.getSurface(),p.getStatut(),p.getEtage(),p.getIdAppartement()};
        System.out.println(values[columnIndex]);
        return values[columnIndex];
        
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Proprietaire","Description","Prix","Ville","Rue","Code Postal","Ascenseur","Surface","Statut","Etage","Id Apparetemment"};
        return columnNames[column];
    }
}