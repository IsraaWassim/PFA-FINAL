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
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import objet.Proprietaire;
import dao.ProprietaireDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifierProprietaire extends JFrame {
	private JTextField txtnom;
	private JTextField txtprenom;
	private JTextField txtcin;
	private JTextField txtmail;
	private JTextField txttel;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String idProprietaire="";
					String nom="";
					String prenom="";
					String cin="";
					String mail="";
					String tel="";
					
					ModifierProprietaire frame = new ModifierProprietaire(idProprietaire,nom,prenom,cin,mail,tel);
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
	public ModifierProprietaire(String idProprietaire, String nom, String prenom,String cin, String mail,
			String tel )  {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 673);
		this.setLocationRelativeTo(null);
		
		JLabel lblModifierProprietaire = new JLabel("Modifier Proprietaire");
		lblModifierProprietaire.setIcon(new ImageIcon(ModifierProprietaire.class.getResource("/Images/3-client-icone-6526-96 (2).png")));
		lblModifierProprietaire.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel label = new JLabel("Nom:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_1 = new JLabel("Pr\u00E9nom :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_2 = new JLabel("CIN :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_3 = new JLabel("E-Mail :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_4 = new JLabel("T\u00E9l\u00E8phone :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProprietaireDAO cd = new ProprietaireDAO();
				Proprietaire a = cd.findProprietaire(new Integer(Integer.parseInt(txtid.getText())));	
				
				a.setCin(txtcin.getText());
				a.setNom(txtnom.getText());
				a.setPrenom(txtprenom.getText());
				a.setMail(txtmail.getText());
				a.setTel(txttel.getText());
				
				cd.update(a);
				
				  JOptionPane.showMessageDialog(null, "Client Modifier ", "OK", JOptionPane.INFORMATION_MESSAGE);
				
			
					// Pour vider les champs
				  
				    txtid.setText(null);
					txtcin.setText(null);
					txtnom.setText(null);
					txtprenom.setText(null);
					txtmail.setText(null);
					txttel.setText(null);
					
					
					ModifierProprietaire.this.hide();
					GestionProprietaire a1 = new GestionProprietaire();
					a1.setVisible(true);
					 
			}
		});
		btnValider.setIcon(new ImageIcon(ModifierProprietaire.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(ModifierProprietaire.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtnom = new JTextField();
		txtnom.setColumns(10);
		
		txtprenom = new JTextField();
		txtprenom.setColumns(10);
		
		txtcin = new JTextField();
		txtcin.setColumns(10);
		
		txtmail = new JTextField();
		txtmail.setColumns(10);
		
		txttel = new JTextField();
		txttel.setColumns(10);
		
		txtid = new JTextField();
		txtid.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(229, Short.MAX_VALUE)
					.addComponent(lblModifierProprietaire)
					.addGap(167))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(161)
					.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(99)
					.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(145, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txttel, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtmail, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtcin, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtprenom, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtnom, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(297, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtid, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(616, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblModifierProprietaire, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(70)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtnom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtprenom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtcin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txttel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnValider, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(txtid, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	
	
	public void setTxtnom(String txt) {
		this.txtnom.setText(txt);
	}

	public void setTxtprenom(String txt) {
		this.txtprenom .setText(txt);
	}

	public void setTxtcin(String txt) {
		
		this.txtcin .setText(txt);
	}

	public void setTxtmail(String txt) {
		this.txtmail.setText(txt);
		
	}

	public void setTxttel(String txt) {
	
		this.txttel.setText(txt);
	}




	public void setTxtid(String txt) {
		this.txtid.setText(txt);
	}
	
}
