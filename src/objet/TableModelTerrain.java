package objet;




import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel; 

import dao.AppartemmentDAO;
import dao.CentreDAO;
import dao.TerrainDAO;

public class TableModelTerrain extends AbstractTableModel
{
    private static final long serialVersionUID = 6105842825518764825L;
    private List<Terrain> terrainList;

    public TableModelTerrain()
    {
        super();
        TerrainDAO terrainDAO = new TerrainDAO();
        terrainList = terrainDAO.getAllTerrain();
       

    }

    public int getRowCount()
    {
        return terrainList.size();
    }

    public int getColumnCount()
    {
        return 10;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex)
    {
    	Terrain p=terrainList.get(rowIndex);
    	Object[] values=new Object[]{p.getIdProprietaire(),p.getId(),p.getProprietaire().getNom()+" "+ p.getProprietaire().getPrenom(),p.getDescription(),p.getSurface(),p.getPrix(),p.getVille(),p.getRue(),p.getCode(),p.getStatut()};
        System.out.println(values.length);
        return values[columnIndex];
        
    }
    public void refreshSupp() {
    	TerrainDAO terrainDAO = new TerrainDAO();
        terrainList = terrainDAO.getAllTerrain();
 	fireTableDataChanged();
 }
    @Override
    public String getColumnName(int column)
    {
        String[] columnNames=new String[]{"Id Proprietaire","Id Centre","Nom & Prenom","Description","Surface","Prix","Ville","Rue","Code Postal","Statut"};
        return columnNames[column];
    }
    public void refreshRecherche(String condition) {
    	TerrainDAO cd = new TerrainDAO();
    	terrainList = cd.getAllTerrainRecherche(condition);
    	fireTableDataChanged();
    }
}