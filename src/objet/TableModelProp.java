package objet;
import java.util.*;

import javax.swing.table.AbstractTableModel; 

import dao.ProprietaireDAO;

public class TableModelProp extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<Proprietaire> propList;

    public TableModelProp()
    {
        super();
        ProprietaireDAO propDAO = new ProprietaireDAO();
        propList = propDAO.getAllProprietaire();
    }

    public int getRowCount()
    {
        return propList.size();
    }

    public int getColumnCount()
    {
        return 6;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Proprietaire p=propList.get(rowIndex);
    	Object[] values=new Object[]{p.getIdProprietaire(),p.getNom(),p.getPrenom(),p.getCin(),p.getMail(),p.getTel()};
        System.out.println(values.length);
        return values[columnIndex];
        
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Proprietaire","Nom","Prenom","CIN","Email","Téléphone"};
        return columnNames[column];
    }
}