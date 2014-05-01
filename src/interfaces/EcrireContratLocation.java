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

import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;

import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;

public class EcrireContratLocation extends JFrame {

	private JPanel contentPane;
	private JTextField cin;
	private JTextField mail;
	private JTextField tel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;


	

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
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les coordonn\u00E9es de Propri\u00E9taire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		
		JLabel lblNomEtPrnom = new JLabel("Nom et Pr\u00E9nom:");
		lblNomEtPrnom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		cin = new JTextField();
		cin.setColumns(10);
		cin.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_1 = new JLabel("E-Mail :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_3 = new JLabel("CIN :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_5 = new JLabel("T\u00E9l\u00E8phone :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBackground(SystemColor.inactiveCaptionBorder);
		
		JComboBox boxnomP = new JComboBox();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addComponent(label_3)
							.addGap(82)
							.addComponent(cin, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(label_1)
							.addGap(31)
							.addComponent(mail, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(label_5)
							.addGap(18)
							.addComponent(tel, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(269)
							.addComponent(lblNomEtPrnom)
							.addGap(55)
							.addComponent(boxnomP, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomEtPrnom)
						.addComponent(boxnomP, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cin, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(label_1)
						.addComponent(mail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(tel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les coordonn\u00E9es de locataire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_6 = new JLabel("E-Mail :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_8 = new JLabel("CIN :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_9 = new JLabel("T\u00E9l\u00E8phone :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label = new JLabel("Nom et Pr\u00E9nom:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox boxNomL = new JComboBox();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addComponent(label_8)
							.addGap(82)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(label_6)
							.addGap(31)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addComponent(label_9)
							.addGap(18)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(271)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(60)
							.addComponent(boxNomL, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
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
					.addGap(35)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8)
						.addComponent(label_6)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(21, Short.MAX_VALUE))
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
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblContratDeLocation, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
							.addGap(209))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDescription)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDateDebut)
									.addGap(34)
									.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(203)
									.addComponent(lblDateFin, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnImprimer, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(dateChooser2, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
											.addGap(44)
											.addComponent(datesig, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
											.addGap(44)
											.addComponent(dateChooser3, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))))
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblContratDeLocation, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(lblDescription))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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
