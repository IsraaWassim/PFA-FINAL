package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;

import dao.ClientDAO;
import objet.Client;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifierClient extends JDialog {

	private JPanel contentPane;
	private JTextField txtnom;
	private JTextField txtprenom;
	private JTextField txtcin;
	private JTextField txtmail;
	private JTextField txttel;
	JTextArea txtdescription;
	JComboBox comboBoxClient;
	private JTextField txtid;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id="";
				    String typeClient="";
					String nom="";
					String prenom="";
					String cin="";
					String mail="";
					String tel="";
					String Description="";
					ModifierClient frame = new ModifierClient(id,typeClient,nom,prenom,cin,mail,tel,Description);
					
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
	public ModifierClient(String id,String typeClient,String nom,String prenom,String cin,String mail,String tel,String Description) {
		setResizable(false);
		setTitle("Modifier Client");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 651, 673);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		JLabel lblModifierClient = new JLabel("Modifier Client");
		lblModifierClient.setIcon(new ImageIcon(ModifierClient.class.getResource("/Images/3-client-icone-6526-96 (2).png")));
		lblModifierClient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		  comboBoxClient = new JComboBox();
		comboBoxClient.setModel(new DefaultComboBoxModel(new String[] {"Locataire", "Acheteur"}));
		comboBoxClient.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label = new JLabel("Type Client :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_1 = new JLabel("Nom:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtnom = new JTextField();
		txtnom.setColumns(10);
		txtnom.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtprenom = new JTextField();
		txtprenom.setColumns(10);
		txtprenom.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_3 = new JLabel("CIN :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtcin = new JTextField();
		txtcin.setColumns(10);
		txtcin.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_4 = new JLabel("E-Mail :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtmail = new JTextField();
		txtmail.setColumns(10);
		txtmail.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_5 = new JLabel("T\u00E9l\u00E8phone :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txttel = new JTextField();
		txttel.setColumns(10);
		txttel.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtdescription = new JTextArea();
		txtdescription.setBackground(SystemColor.inactiveCaptionBorder);
		
		txtcin.setText(cin);
		txtnom.setText(nom);
		txtprenom.setText(prenom);
		txttel.setText(tel);
		txtdescription.setText(Description);
		txtmail.setText(mail);
		
		JButton btnModifier = new JButton("Valider");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientDAO cd = new ClientDAO();
				Client a = cd.findClient(new Integer(Integer.parseInt(txtid.getText())));	
				a.setTypeClient(comboBoxClient.getSelectedItem().toString());
				a.setCin(txtcin.getText());
				a.setNom(txtnom.getText());
				a.setPrenom(txtprenom.getText());
				a.setMail(txtmail.getText());
				a.setTel(txttel.getText());
				a.setDescription(txtdescription.getText());
				cd.update(a);
				
				  JOptionPane.showMessageDialog(null, "Client Modifier ", "OK", JOptionPane.INFORMATION_MESSAGE);
				
			
					// Pour vider les champs
				  
				    txtid.setText(null);
					txtcin.setText(null);
					txtnom.setText(null);
					txtprenom.setText(null);
					txtmail.setText(null);
					txttel.setText(null);
					txtdescription.setText(null);
					
					ModifierClient.this.hide();
					GestionClient a1 = new GestionClient();
					a1.setVisible(true);
					 
			}
		});
		btnModifier.setIcon(new ImageIcon(ModifierClient.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnnuler.setIcon(new ImageIcon(ModifierClient.class.getResource("/Images/supprimer-icone-9337-48.png")));
		
		txtid = new JTextField();
		txtid.setBackground(SystemColor.inactiveCaptionBorder);
		txtid.setColumns(10);
		txtid.setText(id);
		txtid.setEditable(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(274, Short.MAX_VALUE)
					.addComponent(lblModifierClient)
					.addGap(165))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(244, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(comboBoxClient, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addGap(155))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnModifier)
							.addGap(57)
							.addComponent(btnAnnuler))
						.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtmail, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtcin, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtprenom, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(txttel, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtnom, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(73, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtid, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(634, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblModifierClient)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxClient, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(69)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtnom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(txtprenom, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtcin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txttel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(txtdescription, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnModifier)
						.addComponent(btnAnnuler))
					.addGap(13)
					.addComponent(txtid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setVisible(true);
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

	public void setTxtdescription(String txt) {
		
		this.txtdescription.setText(txt);
	}

	public void setComboBoxClient(Object typeClient) {
		comboBoxClient.addItem("Locataire");
		comboBoxClient.addItem("Acheteur");
		this.comboBoxClient.setSelectedItem(typeClient);
	}

	public void setTxtid(String txt) {
		this.txtid = txtid;
	}
	
}
