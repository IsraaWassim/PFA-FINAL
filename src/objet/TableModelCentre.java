package objet;




import java.util.*;

import javax.swing.table.AbstractTableModel; 

import dao.AppartemmentDAO;
import dao.CentreDAO;

public class TableModelCentre extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<Centre> centreList;

    public TableModelCentre()
    {
        super();
        CentreDAO centreDAO = new CentreDAO();
        centreList = centreDAO.getAllCentre();
       

    }

    public int getRowCount()
    {
        return centreList.size();
    }

    public int getColumnCount()
    {
        return 10;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Centre p=centreList.get(rowIndex);
    	Object[] values=new Object[]{p.getIdProprietaire(),p.getId(),p.getProprietaire().getNom()+" "+ p.getProprietaire().getPrenom(),p.getDescription(),p.getSurface(),p.getPrix(),p.getVille(),p.getRue(),p.getCode(),p.getStatut()};
        System.out.println(values.length);
        return values[columnIndex];
        
    }
    public void refreshSupp() {
    	   CentreDAO centreDAO = new CentreDAO();
           centreList = centreDAO.getAllCentre();
    	fireTableDataChanged();
    }
    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Proprietaire","Id Centre","Nom & Prenom","Description","Surface","Prix","Ville","Rue","Code Postal","Statut"};
        return columnNames[column];
    }
    
    public void refreshRecherche(String condition) {
    	CentreDAO cd = new CentreDAO();
    	centreList = cd.getAllCentreRecherche(condition);
    	fireTableDataChanged();
    }
}