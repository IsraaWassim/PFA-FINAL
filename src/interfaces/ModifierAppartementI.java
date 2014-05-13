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
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;

import objet.Appartemment;
import dao.AppartemmentDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifierAppartementI extends JFrame {

	private JPanel contentPane;
	private JTextField txtcode;
	private JTextField txtrue;
	private JTextField txtsurface;
	private JTextField txtprix;
	JTextArea txtdescription ;
	JComboBox comboBoxStatut;
	JComboBox comboBoxVille;
	private JTextField txtid;
	JCheckBox checkBoxAsc;
	String ss="";
	private Object s;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String idAppartement="";
					String description="";
					String prix="";
				    String ville="";
				    String rue="";
				    String code="";
				    String ascenseur="";
				    String surface="";
				    String statut="";
				    String etage="";
				    
					ModifierAppartementI frame = new ModifierAppartementI(idAppartement,description,prix,ville,rue,code,ascenseur,surface,statut,etage);
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
	public ModifierAppartementI(String idAppartement,String description, String prix, String ville,String rue, String code, String ascenseur, String surface,String statut, String etage) {
		setResizable(false);
		setTitle("Modifier Appartement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 689);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JLabel lblModifierAppartement = new JLabel("Modifier Appartement");
		lblModifierAppartement.setIcon(new ImageIcon(ModifierAppartementI.class.getResource("/Images/livre-modifier-icone-6497-32.png")));
		lblModifierAppartement.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
	/*	txtcode.setText(code);
		txtrue.setText(rue);
		txtsurface.setText(surface);
		txtdescription.setText(description);
		txtprix.setText(prix);*/
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
				AppartemmentDAO cd = new AppartemmentDAO();
			    Appartemment a = cd.findAppartemment(new Integer(Integer.parseInt(txtid.getText())));	
				a.setStatut(comboBoxStatut.getSelectedItem().toString());
				a.setVille(comboBoxVille.getSelectedItem().toString());
		        if(checkBoxAsc.isSelected()){ ss="Oui";}else ss="Non";
				a.setAscenseur(ss);
				a.setCode(txtcode.getText());
				a.setRue(txtrue.getText());
				a.setSurface(txtsurface.getText());
				a.setPrix(txtprix.getText());
				a.setDescription(txtdescription.getText());
				cd.update(a);
				
				
				  JOptionPane.showMessageDialog(null, "Client Modifier ", "OK", JOptionPane.INFORMATION_MESSAGE);
				
			
					// Pour vider les champs
				  
				
					 
			}
		});
	
		btnModifier.setIcon(new ImageIcon(ModifierAppartementI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton Annuler = new JButton("Annuler");
		Annuler.setIcon(new ImageIcon(ModifierAppartementI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		Annuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Adresse", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		
		JLabel label_3 = new JLabel("Surface m\u00B2 :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtsurface = new JTextField();
		txtsurface.setColumns(10);
		txtsurface.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_4 = new JLabel("Prix en Dinars :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtprix = new JTextField();
		txtprix.setColumns(10);
		txtprix.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_5 = new JLabel("Statut :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 comboBoxStatut = new JComboBox();
		comboBoxStatut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 txtdescription = new JTextArea();
		txtdescription.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_7 = new JLabel("Ascenseur :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 checkBoxAsc = new JCheckBox();
		checkBoxAsc.setBackground(Color.WHITE);
		
		JLabel lblIdAppartement = new JLabel("ID Appartement:");
		lblIdAppartement.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtid = new JTextField();
		txtid.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(365)
							.addComponent(lblModifierAppartement, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
									.addGap(23)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(comboBoxStatut, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
											.addGap(108)
											.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
											.addGap(38)
											.addComponent(checkBoxAsc, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtprix, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtsurface, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 687, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(307)
							.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(71)
							.addComponent(Annuler, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(391)
							.addComponent(lblIdAppartement)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(lblModifierAppartement, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIdAppartement)
						.addComponent(txtid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtsurface, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtprix, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBoxAsc, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxStatut, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(71)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(Annuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
		);
		
		txtcode = new JTextField();
		txtcode.setColumns(10);
		txtcode.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label = new JLabel("Code Postal :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_1 = new JLabel("Ville :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 comboBoxVille = new JComboBox(new Object[]{});
		comboBoxVille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtrue = new JTextField();
		txtrue.setColumns(10);
		txtrue.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("Rue :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(comboBoxVille, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(label)
					.addGap(56)
					.addComponent(txtcode, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(txtrue, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxVille, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(txtcode, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(63))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	}
	

	public void setTxtcode(String txt) {
		this.txtcode.setText(txt);
	}



	public void setTxtrue(String txt) {
		this.txtrue.setText(txt);
	}




	public void setComboBoxStatut(Object statut) {
		this.comboBoxStatut.getSelectedItem().toString();
	}
	public void setTxtsurface(String txt) {
		this.txtsurface .setText(txt);
	}

	public void setTxtprix(String txt) {
		this.txtprix .setText(txt);
	}

	public void setTxtdescription(String txt) {
		this.txtdescription .setText(txt);
	}

	public void setTxtid(String txt) {
		this.txtid.setText(txt);
	}



	
}

