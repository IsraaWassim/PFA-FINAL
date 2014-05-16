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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import objet.Appartemment;
import objet.Maison;
import dao.AppartemmentDAO;
import dao.MaisonDAO;


public class ModifierMaisonI extends JFrame {

	private JPanel contentPane;
	private JTextField txtsurface;
	private JTextField txtcodepostal;
	private JTextField txtprix;
	private JTextField txtrue;
	private JTextField txtchambre,txtid;
	JComboBox boxstatut;
	JComboBox boxville ;
	String ss="";
	JTextArea txtdescription;
	String jj="";
	JCheckBox checkBoxjardin,CheckBoxgarage;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="";
					String description="";
					String surface="";
				    String prix="";
				    String ville="";
				    String rue="";
				    String code="";
					String nbrChambre="";
					String garage="";
					String jardin="";
					String statut="";
					
					
					ModifierMaisonI frame = new ModifierMaisonI(id,description,surface,prix,ville,rue,code,nbrChambre,garage,jardin,statut);
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
	public ModifierMaisonI(String id,String description,String surface,String prix,String ville,String txttxtrue,String code,String nbrChambre,String garage,String jardin,String statut) {
		setTitle("Modifier Maison");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblModifierMaison = new JLabel("Modifier Maison");
		lblModifierMaison.setIcon(new ImageIcon(ModifierMaisonI.class.getResource("/Images/livre-modifier-icone-6497-32.png")));
		lblModifierMaison.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les caract\u00E9ristiques de la maison :", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
	txtdescription = new JTextArea();
		txtdescription.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_7 = new JLabel("Ville :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_8 = new JLabel("Surface :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_9 = new JLabel("Jardin:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 boxville = new JComboBox(new Object[]{});
		boxville.setModel(new DefaultComboBoxModel(new String[] {"", "Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));
		boxville.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtsurface = new JTextField();
		txtsurface.setColumns(10);
		txtsurface.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_10 = new JLabel("Garage :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_11 = new JLabel("Prix :");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_12 = new JLabel("Code Postal :");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtcodepostal = new JTextField();
		txtcodepostal.setColumns(10);
		txtcodepostal.setBackground(SystemColor.inactiveCaptionBorder);
		
		txtprix = new JTextField();
		txtprix.setColumns(10);
		txtprix.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_13 = new JLabel("txttxtrue :");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel Statut = new JLabel("Statut :");
		Statut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_15 = new JLabel("Chambre :");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtrue = new JTextField();
		txtrue.setColumns(10);
		txtrue.setBackground(SystemColor.inactiveCaptionBorder);
		
		txtchambre = new JTextField();
		txtchambre.setColumns(10);
		txtchambre.setBackground(SystemColor.inactiveCaptionBorder);
		
		 boxstatut = new JComboBox();
		boxstatut.setModel(new DefaultComboBoxModel(new String[] {"", "Location", "Achat"}));
		boxstatut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 checkBoxjardin = new JCheckBox("");
		 if(jardin.equals("Oui"))
			 checkBoxjardin.setSelected(true);
		 CheckBoxgarage = new JCheckBox("");
		 if(garage.equals("Oui"))
			 CheckBoxgarage.setSelected(true);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_7)
										.addComponent(label_11)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addContainerGap()
									.addComponent(label_9)))
							.addGap(38)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(checkBoxjardin)
									.addGap(59))
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtprix, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))
							.addGap(47)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_12)
								.addComponent(label_15)
								.addComponent(label_10))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(txtchambre, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtcodepostal, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
									.addGap(73)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addComponent(label_13)
											.addGap(44)
											.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtsurface, Alignment.LEADING)
												.addComponent(txtrue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
										.addComponent(label_8)))
								.addComponent(CheckBoxgarage)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(373)
							.addComponent(Statut)
							.addGap(48)
							.addComponent(boxstatut, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(boxstatut, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(Statut))
					.addGap(9)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtcodepostal, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
							.addComponent(label_13)
							.addComponent(txtrue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_7)
							.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_12)))
					.addGap(57)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtchambre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_15)
						.addComponent(txtprix, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11)
						.addComponent(label_8)
						.addComponent(txtsurface, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(label_10)
						.addComponent(checkBoxjardin)
						.addComponent(CheckBoxgarage))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
							.addComponent(label_6)
							.addGap(80))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(78)
							.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btnModifier = new JButton("Valider");
		btnModifier.setIcon(new ImageIcon(ModifierMaisonI.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MaisonDAO cd = new MaisonDAO();
			    Maison a =  cd.findMaison(new Integer(Integer.parseInt(txtid.getText())));	
				a.setStatut(boxstatut.getSelectedItem().toString());
				a.setVille(boxville.getSelectedItem().toString());
				
		        if(CheckBoxgarage.isSelected()){ ss="Oui";}else ss="Non";
				a.setGarage(ss);
				if(checkBoxjardin.isSelected()){ jj="Oui";}else jj="Non";
				a.setGarage(jj);
				a.setCode(txtcodepostal.getText());
				a.setRue(txtrue.getText());
				a.setSurface(txtsurface.getText());
				a.setPrix(txtprix.getText());
				a.setNbrChambre(txtchambre.getText());
				a.setDescription(txtdescription.getText());
				cd.update(a);
				
				
		
					
			}
		});
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(ModifierMaisonI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(456, Short.MAX_VALUE)
					.addComponent(lblModifierMaison, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(390))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(340)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addGap(183)
					.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(325, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(55, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblModifierMaison, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(22))))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}


	public void setTxtsurface(String txt) {
		
		this.txtsurface .setText(txt);
	}

	public void setTxtcodepostal(String txt ) {
		
		this.txtcodepostal .setText(txt);
	}

	public void setTxtprix(String txt) {
		
		this.txtprix .setText(txt);
	}

	public void setTxtrue(String txt) {
		
		this.txtrue .setText(txt);
		
	}

	public void setTxtchambre(String txt) {
		
		this.txtchambre .setText(txt);
	}

	public void setTxtid(String txt) {
		
		this.txtid .setText(txt);
	}

	public void setBoxstatut(Object statut ) {
		
		this.boxville.setSelectedItem(statut);
	}

	public void setBoxville(Object ville) {
	
		this.boxville.setSelectedItem(ville);
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public void setTxtdescription(String txt) {
		
		this.txtdescription .setText(txt);
	}



	public void setCheckBoxjardin(JCheckBox checkBoxjardin) {
		this.checkBoxjardin = checkBoxjardin;
	}

	public void setCheckBoxgarage(JCheckBox checkBoxgarage) {
		CheckBoxgarage = checkBoxgarage;
	}
	
}
