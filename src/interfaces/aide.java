package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class aide extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aide frame = new aide();
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
	public aide() {
		setTitle("Aide");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 319);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Bienvenue Dans Notre Agance immobili\u00E9re");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(aide.class.getResource("/Images/maison.png")));
		
		JLabel label_1 = new JLabel("");
		
		JLabel lblDansCetteAgence = new JLabel("Dans cette agence immobili\u00E9re vous pouvez  cr\u00E9er : ");
		lblDansCetteAgence.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		JLabel lblDesPropritaires = new JLabel("- Des propri\u00E9taires avec  leurs Biens");
		lblDesPropritaires.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lbldansClientsEt = new JLabel("- Des Clients et leurs besoins ");
		lbldansClientsEt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblDansContratsDe = new JLabel("- Des Contrats de ventes et d'achats");
		lblDansContratsDe.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDansCetteAgence)
								.addComponent(lblDesPropritaires)
								.addComponent(lbldansClientsEt)
								.addComponent(lblDansContratsDe))))
					.addGap(47))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(79)
									.addComponent(label_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(lblDansCetteAgence)
							.addGap(31)
							.addComponent(lblDesPropritaires)
							.addGap(18)
							.addComponent(lbldansClientsEt)
							.addGap(18)
							.addComponent(lblDansContratsDe)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
