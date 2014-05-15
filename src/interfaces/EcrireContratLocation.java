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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.toedter.calendar.JDateChooser;

import dao.ClientDAO;

import javax.swing.SwingConstants;

import objet.Client;
import objet.Maison;
import objet.Proprietaire;

import java.awt.event.ActionListener;
import java.util.List;

public class EcrireContratLocation extends JFrame {

	private static final int List = 0;
	private static final int Proprietaire = 0;
	private JPanel contentPane;
	private List<Proprietaire> prop;
	JComboBox boxnomP;
	   String tab[];
	   ClientDAO clientDAO;



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
		lblContratDeLocation.setIcon(new ImageIcon(EcrireContratLocation.class.getResource("/Images/100915_contrat.jpg")));
		lblContratDeLocation.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Propri\u00E9taire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		
		JLabel lblNomEtPrnom = new JLabel("Nom et Pr\u00E9nom:");
		lblNomEtPrnom.setFont(new Font("Tahoma", Font.PLAIN, 15));

     

		 clientDAO = new ClientDAO();
		clientDAO.remplirComboBox();
		
		boxnomP = new JComboBox();
		boxnomP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//JOptionPane.showMessageDialog(null,boxnomP.getSelectedItem().toString());
				
			Client client=clientDAO.getprop(boxnomP.getSelectedItem().toString());
			
			
			
			}
		});
		boxnomP.setModel(clientDAO.getaModel());
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(269)
					.addComponent(lblNomEtPrnom)
					.addGap(55)
					.addComponent(boxnomP, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomEtPrnom)
						.addComponent(boxnomP, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " locataire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Nom et Pr\u00E9nom:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox boxNomL = new JComboBox();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(271)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(60)
					.addComponent(boxNomL, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(boxNomL, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(97, Short.MAX_VALUE))
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
		
		btnImprimer.setIcon(new ImageIcon(EcrireContratLocation.class.getResource("/Images/logo-imprimante.jpg")));
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(94)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblContratDeLocation, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
								.addGap(209))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblDateDebut)
								.addGap(34)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
								.addGap(209)
								.addComponent(lblDateFin, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(dateChooser2, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
										.addGap(44)
										.addComponent(datesig, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addGap(44)
										.addComponent(dateChooser3, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(76)
								.addComponent(lblDescription)
								.addGap(41)
								.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
								.addContainerGap()))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblContratDeLocation, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(95)
							.addComponent(lblDescription)))
					.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDateDebut)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(dateChooser2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDateFin, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(dateChooser3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(datesig, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

}
