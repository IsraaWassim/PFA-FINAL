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
import javax.swing.UIManager;
import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class EcrireContratAchat extends JFrame {

	private JPanel contentPane;
	private JTextField cinP;
	private JTextField mailP;
	private JTextField telP;
	private JTextField cinA;
	private JTextField mailA;
	private JTextField telA;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EcrireContratAchat frame = new EcrireContratAchat();
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
	public EcrireContratAchat() {
		setTitle("Ecrire Un Contrat d'Achat");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblContratDachat = new JLabel("Contrat d'Achat\r\n");
		lblContratDachat.setIcon(new ImageIcon(EcrireContratAchat.class.getResource("/Images/a\u00E9ra.jpg")));
		lblContratDachat.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les coordonn\u00E9es de Propri\u00E9taire :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("CIN :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		cinP = new JTextField();
		cinP.setColumns(10);
		cinP.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_1 = new JLabel("E-Mail :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		mailP = new JTextField();
		mailP.setColumns(10);
		mailP.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("T\u00E9l\u00E8phone :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		telP = new JTextField();
		telP.setColumns(10);
		telP.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_3 = new JLabel("Nom et Pr\u00E9nom:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox boxprop = new JComboBox();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addComponent(label)
							.addGap(82)
							.addComponent(cinP, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(label_1)
							.addGap(18))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label_3)
							.addGap(60)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(mailP, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(label_2)
							.addGap(18)
							.addComponent(telP, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addComponent(boxprop, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_3)
						.addComponent(boxprop, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cinP, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(label_1)
						.addComponent(label_2)
						.addComponent(telP, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(mailP, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les coordonn\u00E9es d'Acheteur :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_4 = new JLabel("CIN :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		cinA = new JTextField();
		cinA.setColumns(10);
		cinA.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_5 = new JLabel("E-Mail :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		mailA = new JTextField();
		mailA.setColumns(10);
		mailA.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_6 = new JLabel("T\u00E9l\u00E8phone :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		telA = new JTextField();
		telA.setColumns(10);
		telA.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_7 = new JLabel("Nom et Pr\u00E9nom:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox boxclient = new JComboBox();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addComponent(label_4)
							.addGap(82)
							.addComponent(cinA, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(label_5)
							.addGap(18)
							.addComponent(mailA, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(label_6)
							.addGap(18)
							.addComponent(telA, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(271)
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(60)
							.addComponent(boxclient, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(boxclient, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(cinA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(label_5)
						.addComponent(label_6)
						.addComponent(telA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(mailA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblDescriptionDeBien = new JLabel("Description de Bien :");
		lblDescriptionDeBien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea desciption = new JTextArea();
		desciption.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_8 = new JLabel("Date Signature :");
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JDateChooser dateChooser = new JDateChooser();
	    dateChooser.setBounds(20, 20, 100, 20);
	    this.getContentPane().add(dateChooser);
		
		JTextArea description = new JTextArea();
		description.setBackground(SystemColor.inactiveCaptionBorder);
		
		JButton imprimer = new JButton("Imprimer");
		imprimer.setIcon(new ImageIcon(EcrireContratAchat.class.getResource("/Images/logo-imprimante.jpg")));
		imprimer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(366, Short.MAX_VALUE)
					.addComponent(lblContratDachat, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
					.addGap(269))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblDescriptionDeBien)
							.addGap(18)
							.addComponent(desciption, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(description))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(65, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(382, Short.MAX_VALUE)
					.addComponent(imprimer, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(213)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addGap(57))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblContratDachat, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(72)
							.addComponent(lblDescriptionDeBien))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(desciption, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(description, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(53))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(imprimer, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(19))))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
