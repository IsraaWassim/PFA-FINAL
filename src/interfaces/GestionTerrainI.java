package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import objet.TableModelTerrain;
import objet.Terrain;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import dao.TerrainDAO;

public class GestionTerrainI extends JFrame {

	private JPanel contentPane;
	private JTextField prix;
	private JTable table;
	JComboBox boxville;
	TableModelTerrain model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionTerrainI frame = new GestionTerrainI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionTerrainI() {
		setTitle("Gestion des Terrains");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		JLabel lblGestionDesTerrains = new JLabel("Gestion des Terrains");
		lblGestionDesTerrains.setIcon(new ImageIcon(GestionTerrainI.class.getResource("/Images/logo-terrain.jpg")));
		lblGestionDesTerrains.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Recherche Rapide :", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Prix :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		prix = new JTextField();
		prix.setColumns(10);
		prix.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_1 = new JLabel("Ville :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		 boxville = new JComboBox();
		boxville.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boxville.setModel(new DefaultComboBoxModel(new String[] {"S\u00E9lectionnez une ville", "Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));

		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton filtrer = new JButton("");
		filtrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String condition = " where prix ='"+prix.getText()+"' and ville ='"+boxville.getSelectedItem()+"'";
				((TableModelTerrain)table.getModel()).refreshRecherche(condition);
			}
		});
		filtrer.setIcon(new ImageIcon(GestionTerrainI.class.getResource("/Images/rechercher.gif")));
		filtrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addComponent(label)
					.addGap(53)
					.addComponent(prix, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(label_1)
					.addGap(43)
					.addComponent(boxville, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
					.addComponent(lblRechercher)
					.addGap(33)
					.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)
							.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1)
							.addComponent(lblRechercher)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton ajouter = new JButton("Ajouter ");
		ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionTerrainI.this.hide();
				AjouterTerrainI t = new AjouterTerrainI();
				t.setVisible(true);
			}
		});
		ajouter.setIcon(new ImageIcon(GestionTerrainI.class.getResource("/Images/edit_add.png")));
		ajouter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=(model.getValueAt(table.getSelectedRow(),1).toString());
				String description=(String)(model.getValueAt(table.getSelectedRow(),3));
				String surface=(String)(model.getValueAt(table.getSelectedRow(),4));
				String prix=(String)model.getValueAt(table.getSelectedRow(),5);
	
				String ville=(String)model.getValueAt(table.getSelectedRow(),6);
				String rue=(String)model.getValueAt(table.getSelectedRow(),7);
				String code=(String)model.getValueAt(table.getSelectedRow(),8);
				String statut=(String)model.getValueAt(table.getSelectedRow(),9);
			
				ModifierTerrainI modifierTerrainI = new ModifierTerrainI(id,description,surface, prix,ville, rue,code, statut);
				
				modifierTerrainI.setTxtdescription(description);
				modifierTerrainI.setTxtcodepostal(code);
				modifierTerrainI.setTxtprix(prix);
				modifierTerrainI.setTxtrue(rue);
				modifierTerrainI.setTxtsurface(surface);
				modifierTerrainI.setBoxstatut(statut);
				modifierTerrainI.setVillebox(ville);
				GestionTerrainI.this.hide();
				modifierTerrainI.setVisible(true);
				
				
				
				
			}
		});
		btnModifier.setIcon(new ImageIcon(GestionTerrainI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Terrain c = new Terrain();
				 
				c.setId(Integer.parseInt(model.getValueAt(table.getSelectedRow(),1).toString()));
			
				new TerrainDAO().delete(c);
				((TableModelTerrain)table.getModel()).refreshSupp();

				JOptionPane.showMessageDialog(null, "Terrain Supprimé", "OK", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnSupprimer.setIcon(new ImageIcon(GestionTerrainI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		model = new TableModelTerrain();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(389)
							.addComponent(lblGestionDesTerrains, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(196, Short.MAX_VALUE)
					.addComponent(ajouter, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(191)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(192)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(115))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(157, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 875, GroupLayout.PREFERRED_SIZE)
					.addGap(88))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGestionDesTerrains, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addGap(123)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(ajouter, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(152))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(SystemColor.text);
		table.setModel(model);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(SystemColor.menu);
		contentPane.setLayout(gl_contentPane);
	}

}
