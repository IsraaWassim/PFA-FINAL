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

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Authentification extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Authentification() {
		setResizable(false);
		setTitle("Authentification");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 574, 383);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("Authentification");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JButton btnConnexion = new JButton("Connexion");
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String l=login.getText();
				String m =pwd.getText();


				boolean b=false;

				if (l.equals("admin")== false){
				JOptionPane.showMessageDialog(null," Login ou Mot de passe incorrect E"
						+ "ssayer de nouveau","Error Message",JOptionPane.ERROR_MESSAGE);}
				if (m.equals("1234")== false){JOptionPane.showMessageDialog(null," Mot de passe incoorrect Essayer de nouveau\n","Error Message",JOptionPane.ERROR_MESSAGE);
				}
				  
				 
				if((l.equals("admin"))&&(m.equals("1234"))){
				          
				       
				                new MenuPrincipal().setVisible(true);
				               this.hide();
				            }
				            else
				            {
				                JOptionPane.showMessageDialog(null," Login ou Mot de passe incorrect"
				                		+ "Essayer de nouveau ", "Erreur", JOptionPane.ERROR_MESSAGE,null);
				            } this.setVisible(false);

				
			
			}

			private void hide() {
				// TODO Auto-generated method stub
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnConnexion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConnexion.setIcon(new ImageIcon(Authentification.class.getResource("/Images/limportation-kgpg-icone-9298-48.png")));
		
		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Authentification.class.getResource("/images/kgpg-icone-6007-128.png")));
		
		login = new JTextField();
		login.setBackground(SystemColor.inactiveCaptionBorder);
		login.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(46)
					.addComponent(lblNewLabel_1)
					.addGap(51)
					.addComponent(lblNewLabel)
					.addContainerGap(272, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLogin)
						.addComponent(lblMotDePasse, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(login, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
						.addComponent(pwd, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
					.addGap(96))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(201)
					.addComponent(btnConnexion)
					.addContainerGap(242, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(47)
							.addComponent(lblNewLabel)))
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(login, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(29)
							.addComponent(lblMotDePasse, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(pwd)))
					.addGap(35)
					.addComponent(btnConnexion)
					.addGap(20))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
                
            }
        });
    }
}
