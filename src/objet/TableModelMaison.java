package objet;




import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel; 

import dao.MaisonDAO;

public class TableModelMaison extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<Maison> maisonList;

    public TableModelMaison()
    {
        super();
        MaisonDAO maisonDAO = new MaisonDAO();
        maisonList = maisonDAO.getAllMaison();
       

    }

    public int getRowCount()
    {
        return maisonList.size();
    }

    public int getColumnCount()
    {
        return 13;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Maison p=maisonList.get(rowIndex);
    	Object[] values=new Object[]{p.getIdProprietaire(),p.getId(),p.getProprietaire().getNom()+" "+ p.getProprietaire().getPrenom(),p.getDescription(),p.getSurface(),p.getPrix(),p.getVille(),p.getRue(),p.getCode(),p.getNbrChambre(),p.getGarage(),p.getJardin(),p.getStatut()};
        System.out.println(values.length);
        return values[columnIndex];
        
    }

    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Proprietaire","Id Maison","Nom & Prenom","Description","Surface","Prix","Ville"," Rue","Code postal","Nobmre de chambre","Garage","Jardin","Statut"};
        return columnNames[column];
    }
}