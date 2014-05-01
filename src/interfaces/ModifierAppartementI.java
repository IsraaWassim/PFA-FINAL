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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ModifierAppartementI extends JFrame {

	private JPanel contentPane;
	private JTextField cin;
	private JTextField mail;
	private JTextField nom;
	private JTextField tel;
	private JTextField prenom;
	private JTextField surface;
	private JTextField codepostal;
	private JTextField prix;
	private JTextField etage;
	private JTextField rue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifierAppartementI frame = new ModifierAppartementI();
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
	public ModifierAppartementI() {
		setResizable(false);
		setTitle("Modifier Appartement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1136, 724);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JLabel lblModifierAppartement = new JLabel("Modifier Appartement");
		lblModifierAppartement.setIcon(new ImageIcon(ModifierAppartementI.class.getResource("/Images/livre-modifier-icone-6497-32.png")));
		lblModifierAppartement.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Les coordonn\u00E9es de client :", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Nom:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		cin = new JTextField();
		cin.setColumns(10);
		cin.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_1 = new JLabel("E-Mail :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBackground(SystemColor.inactiveCaptionBorder);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_3 = new JLabel("CIN :");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_4 = new JLabel("Type de client :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox boxclient = new JComboBox();
		boxclient.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label_5 = new JLabel("T\u00E9l\u00E8phone :");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBackground(SystemColor.inactiveCaptionBorder);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1045, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
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
								.addComponent(label_3)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(375)
							.addComponent(label_4)
							.addGap(47)
							.addComponent(boxclient, 0, 134, Short.MAX_VALUE)))
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
				.addGap(0, 224, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(boxclient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setIcon(new ImageIcon(ModifierAppartementI.class.getResource("/Images/modifier.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton button_1 = new JButton("Annuler");
		button_1.setIcon(new ImageIcon(ModifierAppartementI.class.getResource("/Images/supprimer-icone-9337-48.png")));
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Les caract\u00E9ristiques d'appartement :", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JLabel label_6 = new JLabel("Description :");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JTextArea description = new JTextArea();
		description.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_7 = new JLabel("Ville :");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_8 = new JLabel("Surface :");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JComboBox boxville = new JComboBox(new Object[]{});
		
		JLabel label_9 = new JLabel("Code Postal :");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		surface = new JTextField();
		surface.setColumns(10);
		surface.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_10 = new JLabel("Ascenseur :");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_11 = new JLabel("Prix :");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		codepostal = new JTextField();
		codepostal.setColumns(10);
		codepostal.setBackground(SystemColor.inactiveCaptionBorder);
		
		prix = new JTextField();
		prix.setColumns(10);
		prix.setBackground(SystemColor.inactiveCaptionBorder);
		
		JLabel label_12 = new JLabel("Rue :");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_13 = new JLabel("Etages :");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		etage = new JTextField();
		etage.setColumns(10);
		etage.setBackground(SystemColor.inactiveCaptionBorder);
		
		rue = new JTextField();
		rue.setColumns(10);
		rue.setBackground(SystemColor.inactiveCaptionBorder);
		
		JRadioButton ouiAsc = new JRadioButton("oui");
		ouiAsc.setBackground(Color.WHITE);
		
		JRadioButton nonAsc = new JRadioButton("non");
		nonAsc.setBackground(Color.WHITE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1045, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_6)
							.addGap(18)
							.addComponent(description, GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7)
								.addComponent(label_8))
							.addGap(62)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(boxville, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(label_9))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(surface, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_10)
										.addComponent(label_11))))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(codepostal, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(prix, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
									.addGap(58)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_12)
										.addComponent(label_13))
									.addGap(37)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(etage, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addComponent(rue, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(32)
									.addComponent(ouiAsc)
									.addGap(68)
									.addComponent(nonAsc)))))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 323, Short.MAX_VALUE)
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
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_8)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
									.addComponent(surface, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addComponent(label_11))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(prix, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_13)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(38)
							.addComponent(etage, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_10)
								.addComponent(ouiAsc)
								.addComponent(nonAsc))
							.addGap(5)
							.addComponent(description, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_6)
							.addGap(42))))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(454, Short.MAX_VALUE)
					.addComponent(lblModifierAppartement, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
					.addGap(402))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(374, Short.MAX_VALUE)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addGap(121)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(358))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1045, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblModifierAppartement, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

}
