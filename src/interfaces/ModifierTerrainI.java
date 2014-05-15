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
import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JButton;

import objet.Terrain;
import dao.TerrainDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class ModifierTerrainI extends JFrame {

	private JPanel contentPane;
	private JTextField txtsurface;
	private JTextField txtcodepostal;
	private JTextField txtprix;
	private JTextField txtrue;
	JComboBox villebox;
	JTextArea txtdescription;
	private JTextField txtid;
	JComboBox boxstatut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="";
					String description ="";
					String surface ="";
					String prix ="";
					String ville="";
					String rue="";
					String code="";
					String statut="";
					ModifierTerrainI frame = new ModifierTerrainI(id,description,surface,prix,ville,rue,code,statut);
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
	public ModifierTerrainI(String id ,String description, String surface, String prix,String ville, String rue, String code, String statut) {
		setTitle("Modifier Terrain");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 708);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblModifierterrain = new JLabel("Modifier Terrain");
		lblModifierterrain.setIcon(new ImageIcon(ModifierTerrainI.class.getResource("/Images/livre-modifier-icone-6497-32.png")));
		lblModifierterrain.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 txtdescription = new JTextArea();
		txtdescription.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_7 = new JLabel("Ville :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_8 = new JLabel("Surface :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 villebox = new JComboBox(new Object[]{});
		 villebox.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));
		
		JLabel label_9 = new JLabel("Code Postal :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtsurface = new JTextField();
		txtsurface.setColumns(10);
		txtsurface.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_10 = new JLabel("Prix :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtcodepostal = new JTextField();
		txtcodepostal.setColumns(10);
		txtcodepostal.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_11 = new JLabel("Rue :");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtprix = new JTextField();
		txtprix.setColumns(10);
		txtprix.setBackground(SystemColor.inactiveCaptionBorder);
		
		txtrue = new JTextField();
		txtrue.setColumns(10);
		txtrue.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel lblStatut = new JLabel("Statut :");
		lblStatut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 boxstatut = new JComboBox();
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAnnuler.setIcon(new ImageIcon(ModifierTerrainI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
			JButton Valider = new JButton("Valider");
			Valider.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TerrainDAO cd = new TerrainDAO();
					Terrain a = cd.findterrain(new Integer(Integer.parseInt(txtid.getText())));	
					a.setVille(villebox.getSelectedItem().toString());
					a.setStatut(boxstatut.getSelectedItem().toString());
					a.setCode(txtcodepostal.getText());
					a.setDescription(txtdescription.getText());
					a.setPrix(txtprix.getText());
					a.setRue(txtrue.getText());
					a.setSurface(txtsurface.getText());
					cd.update(a);
					
					  JOptionPane.showMessageDialog(null, "Terrain Modifier ", "OK", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			Valider.setIcon(new ImageIcon(ModifierTerrainI.class.getResource("/Images/modifier.png")));
			Valider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
									.addComponent(label_6)
									.addGap(75)
									.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_10)
										.addComponent(label_8)
										.addComponent(label_9)
										.addComponent(label_11)
										.addComponent(label_7)
										.addComponent(lblStatut))
									.addGap(112)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(boxstatut, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtrue, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtcodepostal, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtprix, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtsurface, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(villebox, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(142)
							.addComponent(Valider, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addGap(113)
							.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(boxstatut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStatut))
					.addGap(38)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7)
						.addComponent(villebox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_11)
						.addComponent(txtrue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtcodepostal, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
						.addComponent(label_9))
					.addGap(48)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtsurface, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8))
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(txtprix, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(77)
							.addComponent(label_6))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(54)
							.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(Valider, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(99))
		);
		panel_1.setLayout(gl_panel_1);
		
		txtdescription.setText(description);
		txtcodepostal.setText(code);
		txtprix.setText(prix);
		txtrue.setText(rue);
		txtsurface.setText(surface);
		
		txtid = new JTextField();
		txtid.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(txtid, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addGap(280)
					.addComponent(lblModifierterrain, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblModifierterrain, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}



	public void setTxtsurface(String txt) {
		
		this.txtsurface.setText(txt);
	}

	public void setTxtcodepostal(String txt) {
		this.txtcodepostal.setText(txt);
		
	}


	public void setTxtprix(String txt) {
	     this.txtprix.setText(txt);
	}


	public void setTxtrue(String txt) {
		this.txtrue.setText(txt);
	}


	public void setVillebox(Object ville) {
		this.villebox.setSelectedItem(ville);
	}


	public void setTxtdescription(String txt) {
		this.txtdescription.setText(txt);

	}



	public void setTxtid(String txt) {
		this.txtid.setText(txt);

	}

	public void setBoxstatut(Object statut) {
		boxstatut.addItem("Location");
		boxstatut.addItem("Achat");
		this.boxstatut.setSelectedItem(statut);
	}
	
}
