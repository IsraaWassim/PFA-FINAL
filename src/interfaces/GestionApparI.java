package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import objet.*;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;  

import dao.AppartemmentDAO;
public class GestionApparI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	TableModelAppartement model ;
	private JTextField prix;
	JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionApparI frame = new GestionApparI();
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
	public GestionApparI() {
		
		setTitle("Gestion des Appartements");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);

		JLabel lblGestionDesAppartements = new JLabel("Gestion des appartements");
		lblGestionDesAppartements.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/logo_appartement_immobilier_lardreau.jpg")));
		lblGestionDesAppartements.setFont(new Font("Tahoma", Font.PLAIN, 20));
		model = new TableModelAppartement();

		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AjouterAppartementI a = new AjouterAppartementI();
				a.setVisible(true);
			}
		});
		btnAjouter.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/edit_add.png")));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String idAppartement=(model.getValueAt(table.getSelectedRow(),1).toString());		
				String description=(String)(model.getValueAt(table.getSelectedRow(),3));
				String prix=(String)(model.getValueAt(table.getSelectedRow(),4));
				String ville=(String)model.getValueAt(table.getSelectedRow(),5);
	
				String rue=(String)model.getValueAt(table.getSelectedRow(),6);
				String code=(String)model.getValueAt(table.getSelectedRow(),7);
				String ascenseur=(String)model.getValueAt(table.getSelectedRow(),8);
				String surface=(String)model.getValueAt(table.getSelectedRow(),9);
				String statut=(String)model.getValueAt(table.getSelectedRow(),10);
				String etage=(String)model.getValueAt(table.getSelectedRow(),11);
				//JOptionPane.showMessageDialog(null, idAppartement+" "+description+" "+prix+" "+ville+" "+rue+" "+code+" "+ascenseur+" "+surface+" "+statut+" "+etage);
				//new ModifierAppartementI(idAppartement,description,prix,ville,rue,code,ascenseur,surface,statut,etage);
				ModifierAppartementI modifierAppartementI = new ModifierAppartementI(idAppartement, description, prix, ville, rue, code, ascenseur, surface, statut, etage);
				modifierAppartementI.setTxtcode(code);
				modifierAppartementI.setTxtdescription(description);
				modifierAppartementI.setTxtid(idAppartement);
				modifierAppartementI.setTxtprix(prix);
				modifierAppartementI.setTxtrue(rue);
				modifierAppartementI.setTxtsurface(surface);
				
				modifierAppartementI.setVisible(true);
				
		
			}
		});
		btnModifier.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/modifier.png")));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Appartemment c = new Appartemment();
				 
				c.setIdAppartement(Integer.parseInt(model.getValueAt(table.getSelectedRow(),1).toString()));
			
				new AppartemmentDAO().delete(c);
				
				JOptionPane.showMessageDialog(null, "Appartement Supprimé", "OK", JOptionPane.INFORMATION_MESSAGE);
				
			}
		
		});
		btnSupprimer.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/supprimer-icone-9337-48.png")));
			
		 scrollPane = new JScrollPane();
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));

		
		JLabel label_2 = new JLabel("Filtrer");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/rechercher.gif")));
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addComponent(label)
					.addGap(53)
					.addComponent(prix, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(94)
					.addComponent(label_1)
					.addGap(61)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addComponent(label_2)
					.addGap(30)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)
							.addComponent(label_2)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addGap(197)
					.addComponent(btnModifier, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addGap(142)
					.addComponent(btnSupprimer, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(182))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(378)
					.addComponent(lblGestionDesAppartements)
					.addContainerGap(458, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(110)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 878, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGestionDesAppartements)
					.addGap(44)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(80)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(123)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAjouter)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addGap(103))
		);
		table = new JTable();
		table.setBackground(SystemColor.inactiveCaption);
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(83);
		table.getColumnModel().getColumn(10).setPreferredWidth(104);
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(1).setPreferredWidth(111);
		table.getColumnModel().getColumn(2).setPreferredWidth(98);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(10).setPreferredWidth(104);
		table.getColumnModel().getColumn(11).setPreferredWidth(103);
	
		contentPane.setLayout(gl_contentPane);
	}
}
