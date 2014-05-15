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

import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.SystemColor;

import javax.swing.border.TitledBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;

import dao.AppartemmentDAO;
import dao.ProprietaireDAO;
import objet.Appartemment;
import objet.Proprietaire;

public class AjouterAppartementI extends JFrame {

	private JPanel contentPane;
	private JTextField prenom;
	private JTextField nom;
	private JTextField cin;
	private JTextField mail;
	private JTextField tel;
	private JTextField codePostal;
	private JTextField rue;
	private JTextField surface;
	private JTextField prix;
	private JTextArea description;
	JComboBox villeBox,etageBox,StatutBox;
	JCheckBox checkAsc;
	String ss="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterAppartementI frame = new AjouterAppartementI();
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
	public AjouterAppartementI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AjouterAppartementI.class.getResource("/Images/logo-appartement.jpg")));
		setTitle("Ajouter Appartement");
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
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
		);
		
		JLabel lblGestionDesAppartement = new JLabel("Ajouter  Appartement");
		lblGestionDesAppartement.setIcon(new ImageIcon(AjouterAppartementI.class.getResource("/Images/logo-appartement.jpg")));
		lblGestionDesAppartement.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panelClient = new JPanel();
		panelClient.setBackground(Color.WHITE);
		panelClient.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les coordonn\u00E9es de propri\u00E9taire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelBien = new JPanel();
		panelBien.setBackground(Color.WHITE);
		panelBien.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les caract\u00E9ristiques d'appartement :", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom :");
		lblPrnom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		prenom = new JTextField();
		prenom.setBackground(SystemColor.inactiveCaptionBorder);
		prenom.setColumns(10);
		prenom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBackground(SystemColor.inactiveCaptionBorder);
		nom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		JLabel lblCin = new JLabel("CIN :");
		lblCin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		cin = new JTextField();
		cin.setColumns(10);
		cin.setBackground(SystemColor.inactiveCaptionBorder);
	
		cin.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
		JLabel lblEmail = new JLabel("E-Mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E8phone :");
		lblTlphone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBackground(SystemColor.inactiveCaptionBorder);
		tel.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
		GroupLayout gl_panelClient = new GroupLayout(panelClient);
		gl_panelClient.setHorizontalGroup(
			gl_panelClient.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelClient.createSequentialGroup()
					.addGap(34)
					.addComponent(lblCin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelClient.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelClient.createSequentialGroup()
							.addComponent(cin, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(lblEmail)
							.addGap(29)
							.addComponent(mail, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelClient.createSequentialGroup()
							.addComponent(lblNom)
							.addGap(57)
							.addComponent(nom, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(85)
							.addComponent(lblPrnom)))
					.addGap(35)
					.addGroup(gl_panelClient.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelClient.createSequentialGroup()
							.addComponent(lblTlphone)
							.addGap(18)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_panelClient.setVerticalGroup(
			gl_panelClient.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelClient.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_panelClient.createParallelGroup(Alignment.BASELINE)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrnom)
						.addComponent(nom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNom))
					.addGap(53)
					.addGroup(gl_panelClient.createParallelGroup(Alignment.BASELINE)
						.addComponent(cin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTlphone)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(tel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addContainerGap(30, Short.MAX_VALUE))
				.addGroup(gl_panelClient.createSequentialGroup()
					.addContainerGap(150, Short.MAX_VALUE)
					.addComponent(lblCin)
					.addGap(28))
		);
		panelClient.setLayout(gl_panelClient);
		
	

		
		JButton btnAjouter = new JButton("Ajouter ");
		btnAjouter.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
				
				
				if(rue.getText().equals("") || codePostal.getText().equals("") || surface.getText().equals("") || prix.getText().equals("") || description.getText().equals(""))
				{  
					JOptionPane.showMessageDialog(null, "verifiez les champs s'il vous plait !!");
				}
				else{
				
					 String x=etageBox.getSelectedItem().toString();
					 String y=villeBox.getSelectedItem().toString();
					 String z=StatutBox.getSelectedItem().toString();
					 
			      if(checkAsc.isSelected()){ ss="Oui";}else ss="Non";
				    
			      AppartemmentDAO adao=new AppartemmentDAO();
			      ProprietaireDAO pdao=new ProprietaireDAO();
Appartemment ap=new Appartemment( description.getText(), prix.getText(),y,rue.getText(),codePostal.getText(),ss,surface.getText(),z,x);
Proprietaire pr=new Proprietaire(nom.getText(),prenom.getText(),cin.getText(),mail.getText(),tel.getText());		
ap.setProprietaire(pr);
adao.save(ap);

//Pour vider les champs
codePostal.setText(null);
surface.setText(null);
prix.setText(null);
description.setText(null);
rue.setText(null);
tel.setText(null);
mail.setText(null);
cin.setText(null);
prenom.setText(null);
nom.setText(null);
				JOptionPane.showMessageDialog(null, "Appartemment & Proprietaire  ajoutés avec succés !");
				    }
			}
	
		});
		btnAjouter.setIcon(new ImageIcon(AjouterAppartementI.class.getResource("/Images/edit_add.png")));
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prenom.setText("");
				nom.setText("");
				cin.setText("");
				codePostal.setText("");
				rue.setText("");
				mail.setText("");
				tel.setText("");
				prix.setText("");
				surface.setText("");
				description.setText("");
				checkAsc.setSelected(false);
				
				
			}
		});
		btnAnnuler.setIcon(new ImageIcon(AjouterAppartementI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(419)
							.addComponent(lblGestionDesAppartement))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(385)
							.addComponent(btnAjouter)
							.addGap(134)
							.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(55)
							.addComponent(panelClient, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(panelBien, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lblGestionDesAppartement, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelClient, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelBien, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(73))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(647, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAjouter))
					.addGap(33))
		);
		
		JLabel label = new JLabel("Ville :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		villeBox = new JComboBox(new Object[]{});
		villeBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		villeBox.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));
		
		JLabel label_2 = new JLabel("Code Postal :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		codePostal = new JTextField();
		codePostal.setColumns(10);
		codePostal.setBackground(SystemColor.inactiveCaptionBorder);
		codePostal.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
		JLabel label_1 = new JLabel("Rue :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		rue = new JTextField();
		rue.setColumns(10);
		rue.setBackground(SystemColor.inactiveCaptionBorder);
		rue.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		JLabel lblSurface = new JLabel("Surface m\u00B2 :");
		lblSurface.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		surface = new JTextField();
		surface.setColumns(10);
		surface.setBackground(SystemColor.inactiveCaptionBorder);
        surface.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
		JLabel lblPrix = new JLabel("Prix en Dinars :");
		lblPrix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		prix = new JTextField();
		prix.setColumns(10);
		prix.setBackground(SystemColor.inactiveCaptionBorder);
		prix.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
		JLabel lblEtages = new JLabel("Etages :");
		lblEtages.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblAscenseur = new JLabel("Ascenseur :");
		lblAscenseur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 description = new JTextArea();
		description.setBackground(SystemColor.inactiveCaption);
		description.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		JLabel lblStatut = new JLabel("Statut :");
		lblStatut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		
	    etageBox = new JComboBox();
		etageBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etageBox.setModel(new DefaultComboBoxModel(new String[] {"Etage 1", "Etage 2", "Etage 3", "Etage 4", "Etage 5", "Etage 6", "Etage 7", "Etage 8", "Etage 9"}));
		
		StatutBox = new JComboBox();
		StatutBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatutBox.setModel(new DefaultComboBoxModel(new String[] {"Location", "Achat"}));
		
		 checkAsc = new JCheckBox();
		checkAsc.setBackground(Color.WHITE);
		GroupLayout gl_panelBien = new GroupLayout(panelBien);
		gl_panelBien.setHorizontalGroup(
			gl_panelBien.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBien.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelBien.createSequentialGroup()
							.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
								.addComponent(label)
								.addComponent(lblSurface))
							.addGap(44)
							.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBien.createSequentialGroup()
									.addComponent(villeBox, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(label_2))
								.addGroup(gl_panelBien.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(surface, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblPrix)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
								.addComponent(codePostal, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addComponent(prix, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelBien.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblDescription)
							.addGap(48)
							.addComponent(description, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)))
					.addGap(58)
					.addGroup(gl_panelBien.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
							.addComponent(lblAscenseur)
							.addComponent(label_1))
						.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
							.addComponent(lblEtages)
							.addComponent(lblStatut, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
						.addComponent(rue, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelBien.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(etageBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(StatutBox, Alignment.LEADING, 0, 119, Short.MAX_VALUE))
						.addComponent(checkAsc, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(17))
		);
		gl_panelBien.setVerticalGroup(
			gl_panelBien.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBien.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panelBien.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(label)
						.addGroup(gl_panelBien.createParallelGroup(Alignment.BASELINE)
							.addComponent(villeBox, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_2)
							.addComponent(codePostal, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
							.addComponent(label_1)
							.addComponent(rue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelBien.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBien.createSequentialGroup()
									.addGap(48)
									.addGroup(gl_panelBien.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPrix)
										.addComponent(lblSurface)))
								.addGroup(gl_panelBien.createSequentialGroup()
									.addGap(41)
									.addGroup(gl_panelBien.createParallelGroup(Alignment.BASELINE)
										.addComponent(prix, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAscenseur)
										.addComponent(checkAsc)))))
						.addGroup(gl_panelBien.createSequentialGroup()
							.addGap(58)
							.addComponent(surface, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(29)
					.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelBien.createSequentialGroup()
							.addGroup(gl_panelBien.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblStatut, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(StatutBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panelBien.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelBien.createSequentialGroup()
									.addGap(16)
									.addComponent(lblDescription))
								.addGroup(gl_panelBien.createSequentialGroup()
									.addGap(32)
									.addGroup(gl_panelBien.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEtages)
										.addComponent(etageBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(description, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panelBien.setLayout(gl_panelBien);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
