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
import javax.swing.JTable;

import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import objet.Client;
import objet.TableModelClient;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dao.ClientDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionClient extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField prix;
	TableModelClient model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionClient frame = new GestionClient();
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
	public GestionClient() {
		setTitle("Gestion des Clients");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblGestionDesClients = new JLabel("Gestion des Clients");
		lblGestionDesClients.setIcon(new ImageIcon(GestionClient.class.getResource("/Images/3-client-icone-6526-96 (2).png")));
		lblGestionDesClients.setFont(new Font("Tahoma", Font.PLAIN, 20));
		model = new TableModelClient();
		
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
		filtrer.setIcon(new ImageIcon(GestionClient.class.getResource("/Images/rechercher.gif")));
		filtrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
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
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AjouterClient a = new AjouterClient();
				a.setVisible(true);
			}
		});
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAjouter.setIcon(new ImageIcon(GestionClient.class.getResource("/Images/edit_add.png")));
		
		JButton btnModifier = new JButton("Modifier");
		
		
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id=(model.getValueAt(table.getSelectedRow(),0).toString());
				String typeClient=(String)(model.getValueAt(table.getSelectedRow(),1));
				String nom=(String)(model.getValueAt(table.getSelectedRow(),2));
				String prenom=(String)model.getValueAt(table.getSelectedRow(),3);
	
				String cin=(String)model.getValueAt(table.getSelectedRow(),4);
				String mail=(String)model.getValueAt(table.getSelectedRow(),5);
				String tel=(String)model.getValueAt(table.getSelectedRow(),6);
				String Description=(String)model.getValueAt(table.getSelectedRow(),7);
			
				ModifierClient modifierClient = new ModifierClient(id,typeClient,nom,prenom,cin,mail,tel,Description);
				modifierClient.setTxtcin(nom);
				modifierClient.setTxtdescription(Description);
				modifierClient.setTxtprenom(prenom);
				modifierClient.setTxtcin(cin);
				modifierClient.setTxtmail(mail);
				modifierClient.setTxttel(tel);
				modifierClient.setComboBoxClient(typeClient);
				modifierClient.setVisible(true);
		
			}
		});
		btnModifier.setIcon(new ImageIcon(GestionClient.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Client c = new Client();
				 
				c.setId(Integer.parseInt(model.getValueAt(table.getSelectedRow(),0).toString()));
			
				new ClientDAO().delete(c);
				
				JOptionPane.showMessageDialog(null, "Client Supprimé", "OK", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSupprimer.setIcon(new ImageIcon(GestionClient.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(446)
					.addComponent(lblGestionDesClients)
					.addContainerGap(446, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(198)
					.addComponent(btnAjouter)
					.addGap(208)
					.addComponent(btnModifier)
					.addPreferredGap(ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
					.addComponent(btnSupprimer)
					.addGap(138))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(28, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1082, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 920, GroupLayout.PREFERRED_SIZE)
					.addGap(99))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGestionDesClients)
					.addGap(66)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAjouter)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer))
					.addGap(130))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(200);
		table.setBackground(SystemColor.inactiveCaption);
		contentPane.setLayout(gl_contentPane);

	}
	
	
}
