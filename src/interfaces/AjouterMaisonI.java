package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;

import objet.Maison;
import objet.Proprietaire;
import dao.MaisonDAO;
import dao.ProprietaireDAO;

public class AjouterMaisonI extends JFrame {

	private JPanel contentPane;
	private JTextField cin;
	private JTextField mail;
	private JTextField nom;
	private JTextField tel;
	private JTextField prenom;
	private JTextField surface;
	private JTextField codepostal;
	private JTextField prix;
	private JTextField rue;
	private JTextField chambre;
private JTextArea description;
private JComboBox boxville;
String ss="",ff="";
JCheckBox checkBoxJardin;	
JCheckBox checkBoxGarage ;
JComboBox statut;
/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterMaisonI frame = new AjouterMaisonI();
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
	public AjouterMaisonI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AjouterMaisonI.class.getResource("/Images/immeubles.png")));
		setTitle("Ajouter Maison");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JLabel lblAjouterMaison = new JLabel("Ajouter  Maison");
		lblAjouterMaison.setIcon(new ImageIcon(AjouterMaisonI.class.getResource("/Images/immeubles.png")));
		lblAjouterMaison.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Les coordonn\u00E9es de client :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Nom:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
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
		JLabel label_1 = new JLabel("E-Mail :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBackground(SystemColor.inactiveCaptionBorder);
		
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
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_3 = new JLabel("CIN :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_5 = new JLabel("T\u00E9l\u00E8phone :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
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
		prenom = new JTextField();
		
		prenom.setColumns(10);
		prenom.setBackground(SystemColor.inactiveCaptionBorder);
		prenom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char car = evt.getKeyChar(); 
	             
	             if((car<'a' || car>'z')&&(car<'A'||car>'Z')&&(car>' ')) 
	              evt.consume(); 
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(81)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(cin, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
									.addGap(45)
									.addComponent(label_1)
									.addGap(29)
									.addComponent(mail, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(65)
									.addComponent(nom, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_2)
									.addGap(27))))
						.addComponent(label_3))
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_5)
							.addGap(18)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(prenom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_2)
							.addComponent(nom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)))
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_3)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(cin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_5)
							.addComponent(mail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_1)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les caract\u00E9ristiques de la maison :", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 description = new JTextArea();
		description.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_7 = new JLabel("Ville :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_8 = new JLabel("Surface :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 boxville = new JComboBox(new Object[]{});
		 boxville.setModel(new DefaultComboBoxModel(new String[] {"Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));

		JLabel label_9 = new JLabel("Code Postal :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
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
		
		JLabel lblJardin = new JLabel("Jardin:");
		lblJardin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_11 = new JLabel("Prix :");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		codepostal = new JTextField();
		codepostal.setColumns(10);
		codepostal.setBackground(SystemColor.inactiveCaptionBorder);
		codepostal.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
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
		JLabel label_12 = new JLabel("Rue :");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		
		JLabel lblChambre = new JLabel("Garage :");
		lblChambre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblChambre_1 = new JLabel("Chambre :");
		lblChambre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		chambre = new JTextField();
		chambre.setColumns(10);
		chambre.setBackground(SystemColor.inactiveCaptionBorder);
		chambre.addKeyListener(new KeyAdapter() {
			@Override
		public void keyTyped(KeyEvent evt) {

            char car = evt.getKeyChar(); 
            
            if((car<'0' || car>'9')) 
             evt.consume(); 
           
  }
   
 });
		
		 checkBoxJardin = new JCheckBox("");
		checkBoxJardin.setBackground(Color.WHITE);
		
		 checkBoxGarage = new JCheckBox("");
		checkBoxGarage.setBackground(Color.WHITE);
		
		 statut = new JComboBox();
		statut.setModel(new DefaultComboBoxModel(new String[] {"Loacation", "Achat"}));
		statut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_10 = new JLabel("Statut :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7)
								.addComponent(label_8)
								.addComponent(lblJardin))
							.addGap(62)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBoxJardin)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(boxville, Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(surface, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(17)
									.addComponent(label_9))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(lblChambre)
										.addComponent(label_11))))
							.addGap(57)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(codepostal, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addComponent(prix, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBoxGarage))
							.addGap(56)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_12)
								.addComponent(lblChambre_1)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_6)
							.addGap(18)
							.addComponent(description, GroupLayout.PREFERRED_SIZE, 603, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(statut, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
							.addComponent(rue, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addComponent(chambre, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(label_7)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_9)
							.addComponent(codepostal, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
							.addComponent(label_12)
							.addComponent(rue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(prix, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(surface, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8)
						.addComponent(label_11))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblJardin)
								.addComponent(lblChambre_1)
								.addComponent(lblChambre)
								.addComponent(checkBoxJardin)
								.addComponent(checkBoxGarage))
							.addGap(7))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(chambre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(44)
							.addComponent(label_6))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(description, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(statut, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btnajouter = new JButton("Ajouter ");
		btnajouter.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
				
				
				if(rue.getText().equals("") || codepostal.getText().equals("") || surface.getText().equals("") || prix.getText().equals("") || description.getText().equals(""))
				{  
					JOptionPane.showMessageDialog(null, "verifiez les champs s'il vous plait !!");
				}
				else{
					String x=statut.getSelectedItem().toString();
					 String y=boxville.getSelectedItem().toString();
					 
					 
				      if(checkBoxJardin.isSelected()){ ss="Oui";}else ss="Non";
				      if(checkBoxGarage .isSelected()){ ff="Oui";}else ff="Non";
			      MaisonDAO adao=new MaisonDAO();
			      ProprietaireDAO pdao=new ProprietaireDAO();			
			      Maison ap=new Maison( description.getText(), surface.getText(),prix.getText(),y,rue.getText(),codepostal.getText(),chambre.getText(),ff,ss,x);
			      Proprietaire pr=new Proprietaire(nom.getText(),prenom.getText(),cin.getText(),mail.getText(),tel.getText());		
                  ap.setProprietaire(pr);
			      adao.save(ap);
	


				JOptionPane.showMessageDialog(null, "Maison  & Proprietaire  ajoutés avec succés !");
				//Pour vider les champs
				codepostal.setText(null);
				surface.setText(null);
				prix.setText(null);
				description.setText(null);
				rue.setText(null);
				tel.setText(null);
				mail.setText(null);
				cin.setText(null);
				prenom.setText(null);
				nom.setText(null);
				
				AjouterMaisonI.this.hide();
				GestionMaisonI ap8 =new GestionMaisonI();
				ap8.setVisible(true);
				
				
				
				
				    }
			}
		});
		btnajouter.setIcon(new ImageIcon(AjouterMaisonI.class.getResource("/Images/edit_add.png")));
		btnajouter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prenom.setText("");
				nom.setText("");
				cin.setText("");
				codepostal.setText("");
				rue.setText("");
				mail.setText("");
				tel.setText("");
				prix.setText("");
				surface.setText("");
				description.setText("");
			}
		});
		btnAnnuler.setIcon(new ImageIcon(AjouterMaisonI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(388)
							.addComponent(lblAjouterMaison, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(363)
							.addComponent(btnajouter, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(116)
							.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(380, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAjouterMaison, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnajouter, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
