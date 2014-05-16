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
import javax.swing.DefaultComboBoxModel;

import objet.Centre;
import dao.CentreDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifierCentreCommercialI extends JFrame {

	private JPanel contentPane;
	private JTextField txtrue;
	private JTextField txtcode;
	private JTextField txtsurface;
	private JTextField txtprix;
	JTextArea textArea ;
	JComboBox boxStatut ,boxVille;
	private JTextField txtid;
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
					ModifierCentreCommercialI frame = new ModifierCentreCommercialI(id,description,surface, prix,ville, rue,code, statut);
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
	public ModifierCentreCommercialI(String id ,String description, String surface, String prix,String ville, String rue, String code, String statut){
		setTitle("Modifier Centre commercial");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 708);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblModifierUnCentre = new JLabel("Modifier Un Centre Commercial");
		lblModifierUnCentre.setIcon(new ImageIcon(ModifierCentreCommercialI.class.getResource("/Images/livre-modifier-icone-6497-32.png")));
		lblModifierUnCentre.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon(ModifierCentreCommercialI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(ModifierCentreCommercialI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		 boxStatut = new JComboBox();
		 boxStatut.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 boxStatut.setModel(new DefaultComboBoxModel(new String[] {"", "Location ", "Achat"}));
		
		JLabel label = new JLabel("Statut :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_1 = new JLabel("Ville :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
	 boxVille = new JComboBox(new Object[]{});
		boxVille.setFont(new Font("Tahoma", Font.PLAIN, 15));
		boxVille.setModel(new DefaultComboBoxModel(new String[] {"", "Tunis", "Ariana", "B\u00E9ja", "Ben Arous", "Bizerte", "Gab\u00E8s", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "K\u00E9bili", "Le Kef", "Mahdia", "La Manouba", "M\u00E9denine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzid", "Siliana", "Sousse", "Tataouine", "Tozeur", "Zaghouan"}));
		
		JLabel label_2 = new JLabel("Rue :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_3 = new JLabel("Code Postal :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_4 = new JLabel("Surface :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_5 = new JLabel("Prix :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton valider = new JButton("Valider");
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				CentreDAO cd = new CentreDAO();
				Centre a = cd.findCentre(new Integer(Integer.parseInt(txtid.getText())));	
				a.setVille(boxVille.getSelectedItem().toString());
				a.setStatut(boxStatut.getSelectedItem().toString());
				a.setCode(txtcode.getText());
				a.setDescription(textArea.getText());
				a.setPrix(txtprix.getText());
				a.setRue(txtrue.getText());
				a.setSurface(txtsurface.getText());
				cd.update(a);
				
				  JOptionPane.showMessageDialog(null, "Centre Commercial Modifié ", "OK", JOptionPane.INFORMATION_MESSAGE);
				  
				// Pour vider les champs
					
					txtcode.setText("");
					txtrue.setText("");
					txtprix.setText("");
					txtsurface.setText("");
					textArea.setText("");
	
					ModifierCentreCommercialI.this.hide();
					GestionCentreCommercialI ap8 =new GestionCentreCommercialI();
					ap8.setVisible(true);
			}
		});
		valider.setIcon(new ImageIcon(ModifierCentreCommercialI.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		valider.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton annuler = new JButton("Annuler");
		annuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		annuler.setIcon(new ImageIcon(ModifierCentreCommercialI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		annuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtrue = new JTextField();
		txtrue.setBackground(SystemColor.inactiveCaptionBorder);
		txtrue.setColumns(10);
		
		txtcode = new JTextField();
		txtcode.setBackground(SystemColor.inactiveCaptionBorder);
		txtcode.setColumns(10);
		
		txtsurface = new JTextField();
		txtsurface.setBackground(SystemColor.inactiveCaptionBorder);
		txtsurface.setColumns(10);
		
		txtprix = new JTextField();
		txtprix.setBackground(SystemColor.inactiveCaptionBorder);
		txtprix.setColumns(10);
		
		 textArea = new JTextArea();
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		
		txtid = new JTextField();
		txtid.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(110, Short.MAX_VALUE)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(106)
					.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(278))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(181)
					.addComponent(valider, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addGap(90)
					.addComponent(annuler, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(251, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(83)
									.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(94)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtprix, Alignment.LEADING)
											.addComponent(txtsurface, Alignment.LEADING)
											.addComponent(txtcode, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
											.addComponent(txtrue, Alignment.LEADING))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(boxStatut, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(boxVille, Alignment.LEADING, 0, 194, Short.MAX_VALUE)))
									.addPreferredGap(ComponentPlacement.RELATED, 240, Short.MAX_VALUE)))))
					.addGap(157))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(749, Short.MAX_VALUE)
					.addComponent(txtid, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(209, Short.MAX_VALUE)
					.addComponent(lblModifierUnCentre, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblModifierUnCentre, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(9))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(boxStatut, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(boxVille, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addGap(36)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrue, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtcode, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtsurface, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtprix, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(annuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(valider, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addGap(152)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnnuler, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
public void setTxtsurface(String txt) {
		
		this.txtsurface.setText(txt);
	}

	public void setTxtcodepostal(String txt) {
		this.txtcode.setText(txt);
		
	}


	public void setTxtprix(String txt) {
	     this.txtprix.setText(txt);
	}


	public void setTxtrue(String txt) {
		this.txtrue.setText(txt);
	}


	public void setVillebox(Object ville) {
		this.boxVille.setSelectedItem(ville);
	}


	public void setTxtdescription(String txt) {
		this.textArea.setText(txt);

	}

	public void setTxtid(String txt) {
		this.txtid.setText(txt);

	}

	

	public void setBoxstatut(Object statut) {
		
		this.boxStatut.setSelectedItem(statut);
	}
	
	
	
}
