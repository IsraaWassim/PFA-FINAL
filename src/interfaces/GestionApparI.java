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
	TableModel model ;
	private JTextField prix;
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
		setResizable(false);
		setTitle("Gestion des Appartements");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
	
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGestionDesAppartements = new JLabel("Gestion des appartements");
		lblGestionDesAppartements.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/edit_add.png")));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/modifier.png")));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Appartemment c = new Appartemment();
				 
				c.setIdAppartement(Integer.parseInt(model.getValueAt(table.getSelectedRow(),12).toString()));
				//String description=(model.getValueAt(table.getSelectedRow(),1).toString());
				/*String prix=(String)(model.getValueAt(table.getSelectedRow(),2));
				String ville=(String)(model.getValueAt(table.getSelectedRow(),3));
				String rue=(String)model.getValueAt(table.getSelectedRow(),4);
				String code=(String)model.getValueAt(table.getSelectedRow(),5);
				String ascenseur=(String)model.getValueAt(table.getSelectedRow(),6);
				String surface=(String)model.getValueAt(table.getSelectedRow(),7);
				String statut=(String)model.getValueAt(table.getSelectedRow(),8);
				String etage=(String)model.getValueAt(table.getSelectedRow(),8);
		*/
			//c.setIdAppartement(Integer.parseInt(idAppartement));
			/*	c.setDescription(description);
				c.setPrix(prix);
				c.setVille(ville);
				c.setRue(rue);
				c.setCode(code);
				c.setAscenseur(ascenseur);
				c.setSurface(surface);
				c.setStatut(statut);
				c.setEtage(etage);
				 */
				new AppartemmentDAO().delete(c);
				
				JOptionPane.showMessageDialog(null, "Client Supprimer ", "OK", JOptionPane.INFORMATION_MESSAGE);
				
			}
		
		});
		btnSupprimer.setIcon(new ImageIcon(GestionApparI.class.getResource("/Images/supprimer-icone-9337-48.png")));
			
		JScrollPane scrollPane = new JScrollPane();
		
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
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label_2 = new JLabel("Filtrer");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton button = new JButton("");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(67)
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 127, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1)
						.addComponent(label)
						.addComponent(label_2))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(500)
					.addComponent(lblGestionDesAppartements)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnModifier, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 877, GroupLayout.PREFERRED_SIZE)
					.addGap(100))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(163)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(197, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAjouter, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(985))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSupprimer, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(995))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(lblGestionDesAppartements))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(86)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
					.addComponent(btnAjouter)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(236, Short.MAX_VALUE))
		);
		table = new JTable();
		model = new TableModel();
		table.setBackground(SystemColor.control);
		scrollPane.setViewportView(table);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(83);
		table.getColumnModel().getColumn(10).setPreferredWidth(104);
		contentPane.setLayout(gl_contentPane);
	}
}
