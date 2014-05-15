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

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import objet.Centre;
import objet.TableModelCentre;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import dao.CentreDAO;

import javax.swing.DefaultComboBoxModel;

public class GestionCentreCommercialI extends JFrame {

	private JPanel contentPane;
	private JTextField prix;
	TableModelCentre model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionCentreCommercialI frame = new GestionCentreCommercialI();
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
	public GestionCentreCommercialI() {
		setResizable(false);
		setTitle("Gestion des centres Commerciaux");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGestionDesCentres = new JLabel("Gestion des Centres Commerciaux");
		lblGestionDesCentres.setIcon(new ImageIcon(GestionCentreCommercialI.class.getResource("/Images/logo-locauxcommerciaux.jpg")));
		lblGestionDesCentres.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		model = new TableModelCentre();
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Recherche Rapide :", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Prix :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		prix = new JTextField();
		prix.setColumns(10);
		prix.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_1 = new JLabel("Ville :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		final JComboBox boxville = new JComboBox();
		boxville.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));
		
		JLabel label_2 = new JLabel("Filtrer");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton filtrer = new JButton("");
		filtrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String condition = " where prix ='"+prix.getText()+"' and ville ='"+boxville.getSelectedItem()+"'";
				((TableModelCentre)table.getModel()).refreshRecherche(condition);
			}
		});
		filtrer.setIcon(new ImageIcon(GestionCentreCommercialI.class.getResource("/Images/rechercher.gif")));
		filtrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 760, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addComponent(label)
					.addGap(53)
					.addComponent(prix, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(label_1)
					.addGap(30)
					.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(67)
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 127, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label)
						.addComponent(label_2))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton ajouter = new JButton("Ajouter ");
		ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AjouterCentreCommercialI i = new AjouterCentreCommercialI();
			i.setVisible(true);
			}
		});
		ajouter.setIcon(new ImageIcon(GestionCentreCommercialI.class.getResource("/Images/edit_add.png")));
		ajouter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				
				String id=(model.getValueAt(table.getSelectedRow(),1).toString());
				String description=(String)(model.getValueAt(table.getSelectedRow(),3));
				String surface=(String)(model.getValueAt(table.getSelectedRow(),4));
				String prix=(String)model.getValueAt(table.getSelectedRow(),5);
	
				String ville=(String)model.getValueAt(table.getSelectedRow(),6);
				String rue=(String)model.getValueAt(table.getSelectedRow(),7);
				String code=(String)model.getValueAt(table.getSelectedRow(),8);
				String statut=(String)model.getValueAt(table.getSelectedRow(),9);
			
				ModifierCentreCommercialI modifierTerrainI = new ModifierCentreCommercialI(id,description,surface, prix,ville, rue,code, statut);
				modifierTerrainI.setTxtid(id);
				modifierTerrainI.setTxtdescription(description);
				modifierTerrainI.setTxtcodepostal(code);
				modifierTerrainI.setTxtprix(prix);
				modifierTerrainI.setTxtrue(rue);
				modifierTerrainI.setTxtsurface(surface);
				modifierTerrainI.setBoxstatut(statut);
				modifierTerrainI.setVillebox(ville);
				
				
				modifierTerrainI.setVisible(true);
				
				
				
			}
		});
		btnModifier.setIcon(new ImageIcon(GestionCentreCommercialI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Centre c = new Centre();
				 
				c.setId(Integer.parseInt(model.getValueAt(table.getSelectedRow(),1).toString()));
			
				new CentreDAO().delete(c);
				((TableModelCentre)table.getModel()).refreshSupp();
				JOptionPane.showMessageDialog(null, "Centre Commercial Supprimé", "OK", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSupprimer.setIcon(new ImageIcon(GestionCentreCommercialI.class.getResource("/Images/supprimer.png")));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(438, Short.MAX_VALUE)
					.addComponent(lblGestionDesCentres, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
					.addGap(248))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(162)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(198, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(189, Short.MAX_VALUE)
					.addComponent(ajouter, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(166)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(141)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(198))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(83)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 929, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(108, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGestionDesCentres, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(64)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(69)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(ajouter, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(104))
		);
		
				
				table = new JTable();
				scrollPane.setViewportView(table);
				
				table.setModel(model);
				table.setBackground(SystemColor.inactiveCaption);
		contentPane.setLayout(gl_contentPane);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
	}
}
