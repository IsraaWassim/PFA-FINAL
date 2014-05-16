
package interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
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

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.toedter.calendar.JDateChooser;

import dao.AppartemmentDAO;
import dao.ClientDAO;
import dao.ContratDAO;
import dao.ProprietaireDAO;

import javax.swing.SwingConstants;

import objet.Appartemment;
import objet.Client;
import objet.Maison;
import objet.Proprietaire;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcrireContratLocation extends JFrame {

	private static final int List = 0;
	private static final int Proprietaire = 0;
	private JPanel contentPane;
	private List<Proprietaire> prop;
	private DefaultComboBoxModel aModel,aModel2;
	private Map<Integer, Client> map = null;
	private Map<Integer, Proprietaire> mam = null;
	JComboBox boxnomP,boxNomL;
	private JComboBox boxNomL_1;
	String tab[];
	ClientDAO clientDAO;
	ProprietaireDAO proprietaireDAO;
	private JTextField cin;
	private JTextField mail;
	private JTextField tel;
	private JTextField cinp;
	private JTextField mailp;
	private JTextField telp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EcrireContratLocation frame = new EcrireContratLocation();
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
	public EcrireContratLocation() {
		setTitle("Ecrire Un Contrat de Location");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JLabel lblContratDeLocation = new JLabel("Contrat de Location");
		lblContratDeLocation.setIcon(new ImageIcon(EcrireContratLocation.class
				.getResource("/Images/100915_contrat.jpg")));
		lblContratDeLocation
				.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Client  :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);

		JLabel lblNomEtPrnom = new JLabel("Nom et Pr\u00E9nom:");
		lblNomEtPrnom.setFont(new Font("Tahoma", Font.PLAIN, 15));

		clientDAO = new ClientDAO();
		aModel = new DefaultComboBoxModel();
		List<Client> l = clientDAO.getAllClient();
		aModel.addElement("");
		int i=1;
		map=new HashMap<Integer, Client>();
		for (Client prop : l) {

			aModel.addElement(prop.getNom() + " " + prop.getPrenom());
			map.put(i, prop);
			i++;
		}

		boxnomP = new JComboBox();
		boxnomP.setModel(aModel);
		boxnomP.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					int selectedIndex = boxnomP.getSelectedIndex();
					if(selectedIndex!=0)
					{
						Client client = map.get(boxnomP.getSelectedIndex());
						cin.setText(client.getCin());
						mail.setText(client.getMail());
						tel.setText(client.getTel());
					}
					else
					{
						cin.setText("");
						mail.setText("");
						tel.setText("");
					}
				}
			}
		});

		cin = new JTextField();
		cin.setBackground(SystemColor.inactiveCaptionBorder);
		cin.setColumns(10);
		cin.setEditable(false);
		cin.setHorizontalAlignment(JTextField.CENTER);

		JLabel lblCin = new JLabel("CIN :");
		lblCin.setFont(new Font("Tahoma", Font.PLAIN, 15));

		mail = new JTextField();
		mail.setBackground(SystemColor.inactiveCaptionBorder);
		mail.setColumns(25);
		mail.setEditable(false);
		mail.setHorizontalAlignment(JTextField.CENTER);

		JLabel lblMail = new JLabel("Mail :");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone :");
		lblTlphone.setFont(new Font("Dialog", Font.PLAIN, 15));

		tel = new JTextField();
		tel.setBackground(SystemColor.inactiveCaptionBorder);
		tel.setColumns(10);
		tel.setEditable(false);
		tel.setHorizontalAlignment(JTextField.CENTER);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNomEtPrnom)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCin)
							.addGap(30)
							.addComponent(cin, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addGap(96)
							.addComponent(lblMail)))
					.addGap(55)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(mail, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
							.addComponent(lblTlphone)
							.addGap(70)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addGap(97))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(boxnomP, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(403, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomEtPrnom)
						.addComponent(boxnomP, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cin, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCin)
						.addComponent(tel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTlphone)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMail))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " Proprietaire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);

		JLabel label = new JLabel("Nom et Pr\u00E9nom:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));

		 boxNomL = new JComboBox();
		proprietaireDAO = new ProprietaireDAO();
		aModel2 = new DefaultComboBoxModel();
		List<Proprietaire> p = proprietaireDAO.getAllProprietaire();
		aModel2.addElement("");
		int j=1;
		mam=new HashMap<Integer, Proprietaire>();
		for (Proprietaire prop : p) {

			aModel2.addElement(prop.getNom() + " " + prop.getPrenom());
			mam.put(j, prop);
			j++;
		}

		boxNomL_1 = new JComboBox();
		boxNomL_1.setModel(aModel2);
		boxNomL_1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					int selectedIndex = boxNomL.getSelectedIndex();
					if(selectedIndex!=0)
					{
						Proprietaire proprietaire = mam.get(boxNomL.getSelectedIndex());
						cinp.setText(proprietaire.getCin());
						mailp.setText(proprietaire.getMail());
						telp.setText(proprietaire.getTel());
					}
					else
					{
						cinp.setText("");
						mailp.setText("");
						telp.setText("");
					}
				}
			}
		});

		JLabel label_1 = new JLabel("CIN :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		cinp = new JTextField();
		cinp.setBackground(SystemColor.inactiveCaptionBorder);
		cinp.setColumns(10);

		mailp = new JTextField();
		mailp.setBackground(SystemColor.inactiveCaptionBorder);
		mailp.setColumns(10);

		JLabel label_2 = new JLabel("Mail :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		telp = new JTextField();
		telp.setBackground(SystemColor.inactiveCaptionBorder);
		telp.setColumns(10);

		JLabel label_3 = new JLabel("T\u00E9l\u00E9phone :");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(35, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(cinp, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addGap(94)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(55))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(41)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(boxNomL_1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(mailp, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(telp, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addGap(89))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(boxNomL_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(cinp, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
							.addGap(22))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
										.addComponent(mailp, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addComponent(telp, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		panel_1.setLayout(gl_panel_1);

		JLabel lblDescription = new JLabel("Description de Bien:");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.inactiveCaptionBorder);

		JLabel lblDateDebut = new JLabel("Date Debut :");
		lblDateDebut.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblDateFin = new JLabel("Date Fin:");
		lblDateFin.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JDateChooser dateChooser2 = new JDateChooser();
		dateChooser2.setBounds(20, 20, 100, 20);
		this.getContentPane().add(dateChooser2);

		JLabel datesig = new JLabel("Date Signature :");
		datesig.setHorizontalAlignment(SwingConstants.TRAILING);
		datesig.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JDateChooser dateChooser3 = new JDateChooser();
		dateChooser3.setBounds(20, 20, 100, 20);
		this.getContentPane().add(dateChooser3);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(20, 20, 100, 20);
		this.getContentPane().add(dateChooser);
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		//il faut supprimer ele contenu de la table contrat
		//insertion des nouveaus=x données du foormulaire dans la table
		
		 String y=boxNomL.getSelectedItem().toString();
		 String z=boxnomP.getSelectedItem().toString();
	
    
		ImprimerContrat.imprimer(false);
		
	}});
				
		btnImprimer.setIcon(new ImageIcon(EcrireContratLocation.class
				.getResource("/Images/logo-imprimante.jpg")));
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1053, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblDescription)
										.addGap(87)
										.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)))
								.addGap(57))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblContratDeLocation, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
								.addGap(289))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(lblDateDebut)
								.addGap(61)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
								.addGap(91)
								.addComponent(lblDateFin, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addGap(43)
								.addComponent(dateChooser2, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addGap(58)
								.addComponent(datesig, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(dateChooser3, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
								.addGap(45)))))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(532, Short.MAX_VALUE)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(488))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblContratDeLocation, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(258)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblDescription)
							.addGap(77))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDateFin, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDateDebut)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(datesig, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(dateChooser2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(dateChooser3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
