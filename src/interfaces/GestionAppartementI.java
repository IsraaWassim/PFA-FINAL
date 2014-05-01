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
import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.UIManager;

import objet.TableModel;

public class GestionAppartementI extends JFrame {
	
    JPanel contentPane;
	JTable table;
	private JTextField prix;
	TableModel model ;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionAppartementI frame = new GestionAppartementI();
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
	public GestionAppartementI() {
		setResizable(false);
		setTitle("Gestion Appartement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblGestionDesAppartement = new JLabel("Gestion des Appartements ");
		lblGestionDesAppartement.setIcon(new ImageIcon(GestionAppartementI.class.getResource("/Images/logo-appartement.jpg")));
		lblGestionDesAppartement.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton button = new JButton("Ajouter ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AjouterAppartementI m =new AjouterAppartementI();
				m.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(GestionAppartementI.class.getResource("/Images/edit_add.png")));
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ModifierAppartementI m = new ModifierAppartementI();
			m.setVisible(true);
			}
		});
		btnModifier.setIcon(new ImageIcon(GestionAppartementI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon(GestionAppartementI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Recherche Rapide :", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel_1.setBackground(Color.WHITE);
		
		
		//table.setBackground(SystemColor.control);
		//table.setBorder(new LineBorder(new Color(0, 0, 0)));
		 TableModel model = new TableModel();
		 JTable table = new JTable(model);
	
		 JScrollPane scrollPane = new JScrollPane(table);
		 scrollPane.setBounds(10, 55, 636, 187);
		contentPane.add(scrollPane);
	
		

		
		
//		table.setModel(tableModel);
		//table.setModel(new TableModel());
		//	JScrollPane pane= new 	JScrollPane(table);
		/*table.setSurrendersFocusOnKeystroke(true);
		table.setCellSelectionEnabled(true);
	table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));*/
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSupprimer, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
					.addGap(91)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 793, GroupLayout.PREFERRED_SIZE)
					.addGap(74))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(162)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(188, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(392)
					.addComponent(lblGestionDesAppartement)
					.addContainerGap(403, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnModifier, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addGap(958))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGestionDesAppartement)
					.addGap(45)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(126)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(138, Short.MAX_VALUE))
		);
		
		JLabel lblPrix = new JLabel("Prix :");
		lblPrix.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		prix = new JTextField();
		prix.setBackground(SystemColor.inactiveCaptionBorder);
		prix.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville :");
		lblVille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnFiltrer = new JButton("");
		btnFiltrer.setIcon(new ImageIcon(GestionAppartementI.class.getResource("/Images/rechercher.gif")));
		btnFiltrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox villebox = new JComboBox();
		
		JLabel lblFiltrer = new JLabel("Filtrer");
		lblFiltrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(59)
					.addComponent(lblPrix)
					.addGap(53)
					.addComponent(prix, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblVille)
					.addGap(30)
					.addComponent(villebox, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(67)
					.addComponent(lblFiltrer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFiltrer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFiltrer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(villebox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVille)
						.addComponent(lblPrix)
						.addComponent(lblFiltrer))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}


}
