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
import javax.swing.table.DefaultTableModel;

import objet.Proprietaire;
import objet.TableModelProp;

import javax.swing.JScrollPane;

import dao.ProprietaireDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionProprietaire extends JFrame {

	private JPanel contentPane;
	private JTextField prix;
	private JTable table;
	TableModelProp model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionProprietaire frame = new GestionProprietaire();
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
	public GestionProprietaire() {
		setTitle("Gestion des Propriétaires");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		JLabel lblGestionPropritaires = new JLabel("Gestion Propri\u00E9taires ");
		lblGestionPropritaires.setIcon(new ImageIcon(GestionProprietaire.class.getResource("/Images/3-client-icone-6526-96 (2).png")));
		lblGestionPropritaires.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
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
		
		JComboBox comboBoxVille = new JComboBox();
		
		JLabel label_2 = new JLabel("Filtrer");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton filtrer = new JButton("");
		filtrer.setIcon(new ImageIcon(GestionProprietaire.class.getResource("/Images/rechercher.gif")));
		filtrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 920, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addComponent(label)
					.addGap(53)
					.addComponent(prix, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
					.addComponent(label_1)
					.addGap(46)
					.addComponent(comboBoxVille, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(89)
					.addComponent(label_2)
					.addGap(48)
					.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(84))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 127, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)
							.addComponent(label_2)
							.addComponent(comboBoxVille, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton modifier = new JButton("Modifier");
		modifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String idProprietaire=(model.getValueAt(table.getSelectedRow(),0).toString());
				String nom=(String)(model.getValueAt(table.getSelectedRow(),1));
				String prenom=(String)model.getValueAt(table.getSelectedRow(),2);
	
				String cin=(String)model.getValueAt(table.getSelectedRow(),3);
				String mail=(String)model.getValueAt(table.getSelectedRow(),4);
				String tel=(String)model.getValueAt(table.getSelectedRow(),5);
		
				
				ModifierProprietaire modifierClient = new ModifierProprietaire(idProprietaire,nom,prenom,cin,mail,tel);
				modifierClient.setTxtcin(nom);
				modifierClient.setTxtdescription(Description);
				modifierClient.setTxtprenom(prenom);
				modifierClient.setTxtcin(cin);
				modifierClient.setTxtmail(mail);
				modifierClient.setTxttel(tel);
				
				GestionProprietaire.this.hide();
				modifierClient.setVisible(true);
				
		
			}
		});
		modifier.setIcon(new ImageIcon(GestionProprietaire.class.getResource("/Images/modifier.png")));
		modifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		model = new TableModelProp();
		
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(450)
					.addComponent(lblGestionPropritaires)
					.addContainerGap(420, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(136, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 920, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(116, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 994, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(498, Short.MAX_VALUE)
					.addComponent(modifier, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(471))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblGestionPropritaires)
					.addGap(70)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addComponent(modifier, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
					.addGap(62))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(4).setPreferredWidth(124);
		
			table.setBackground(SystemColor.inactiveCaption);
		contentPane.setLayout(gl_contentPane);
	}
}
