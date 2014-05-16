package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ModifierProprietaire extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String idProprietaire="";
					String nom="";
					String prenom="";
					String cin="";
					String mail="";
					String tel="";
					
					ModifierProprietaire frame = new ModifierProprietaire(idProprietaire,nom,prenom,cin,mail,tel);
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
	public ModifierProprietaire(String idProprietaire,String nom, String prenom,String cin, String mail,
			String tel )  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}

}
