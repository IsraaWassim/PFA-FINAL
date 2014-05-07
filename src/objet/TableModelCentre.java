package objet;




import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel; 

import dao.AppartemmentDAO;
import dao.CentreCommercialDAO;

public class TableModelCentre extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<CentreCommercial> centreList;

    public TableModelCentre()
    {
        super();
        CentreCommercialDAO centreDAO = new CentreCommercialDAO();
        centreList = centreDAO.getAllCentreCommercial();
       
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
    	CentreCommercial p=centreList.get(rowIndex);
    	Object[] values=new Object[]{p.getIdProprietaire(),p.getId(),p.getProprietaire().getNom()+" "+ p.getProprietaire().getPrenom(),p.getDescription(),p.getPrix(),p.getVille(),p.getRue(),p.getCode(),p.getSurface(),p.getStatut()};
        System.out.println(values.length);
        return values[columnIndex];
        
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Proprietaire","Id Centre Commercial","Nom & Prenom","Description","Prix","Ville","Rue","Code Postal","Surface","Statut"};
        return columnNames[column];
    }
}