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

import objet.Maison;
import objet.TableModelMaison;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import dao.MaisonDAO;

public class GestionMaisonI extends JFrame {

	private JPanel contentPane;
	private JTextField prix;
	private JTable table;
	TableModelMaison model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionMaisonI frame = new GestionMaisonI();
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
	public GestionMaisonI() {
		setResizable(false);
		setTitle("Gestion des maisons");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		JLabel lblGestionDesMaisons = new JLabel("Gestion des Maisons");
		lblGestionDesMaisons.setIcon(new ImageIcon(GestionMaisonI.class.getResource("/Images/immeubles.png")));
		lblGestionDesMaisons.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
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
		
		JComboBox boxville = new JComboBox();
		boxville.setFont(new Font("Tahoma", Font.PLAIN, 16));
		 boxville.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));

		
		JLabel label_2 = new JLabel("Filtrer");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton filtrer = new JButton("");
		filtrer.setIcon(new ImageIcon(GestionMaisonI.class.getResource("/Images/rechercher.gif")));
		filtrer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addComponent(label)
					.addGap(53)
					.addComponent(prix, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(label_1)
					.addGap(39)
					.addComponent(boxville, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(91)
					.addComponent(label_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(prix, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(filtrer, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(label_2)
						.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton ajouter = new JButton("Ajouter ");
		ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjouterMaisonI m = new AjouterMaisonI();
				m.setVisible(true);
			}
		});
		ajouter.setIcon(new ImageIcon(GestionMaisonI.class.getResource("/Images/edit_add.png")));
		ajouter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifierMaisonI m = new ModifierMaisonI();
				m.setVisible(true);
			}
		});
		btnModifier.setIcon(new ImageIcon(GestionMaisonI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Maison c = new Maison();
				 
				c.setId(Integer.parseInt(model.getValueAt(table.getSelectedRow(),1).toString()));
			
				new MaisonDAO().delete(c);
				((TableModelMaison)table.getModel()).refreshSupp();

				
				JOptionPane.showMessageDialog(null, "Maison Supprim�e", "OK", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnSupprimer.setIcon(new ImageIcon(GestionMaisonI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		model = new TableModelMaison();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(374)
							.addComponent(lblGestionDesMaisons, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(99)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(215)
					.addComponent(ajouter, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(169)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblGestionDesMaisons, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(111)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(ajouter, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(81);
		table.getColumnModel().getColumn(2).setPreferredWidth(82);
		table.getColumnModel().getColumn(9).setPreferredWidth(108);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(SystemColor.menu);
		contentPane.setLayout(gl_contentPane);
		
	}

}
