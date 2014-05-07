package objet;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel; 

import dao.ClientDAO;

public class TableModelClient extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<Client> clientList;

    public TableModelClient()
    {
        super();
        ClientDAO clientDAO = new ClientDAO();
        clientList = clientDAO.getAllClient();
    }

    public int getRowCount()
    {
        return clientList.size();
    }

    public int getColumnCount()
    {
        return 8;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Client p=clientList.get(rowIndex);
    	Object[] values=new Object[]{p.getId(),p.getTypeClient(),p.getNom(),p.getPrenom(),p.getCin(),p.getMail(),p.getTel(),p.getDescription()};
        System.out.println(values.length);
        return values[columnIndex];
        
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Client","Type Client","Nom","Prenom","CIN","Email","Téléphone","Description"};
        return columnNames[column];
    }
}