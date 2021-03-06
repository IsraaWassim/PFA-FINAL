

package interfaces;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class MenuPrincipal extends javax.swing.JFrame {

 
    public MenuPrincipal() {
    	setFont(new Font("Dialog", Font.PLAIN, 15));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/Images/maison - Copie.png")));
    	setResizable(false);
    	getContentPane().setBackground(Color.WHITE);
    	setBackground(SystemColor.inactiveCaptionBorder);
       
        initComponents();
        this.setLocationRelativeTo(null);
              //this.setAlwaysOnTop(true); 
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBorder(new LineBorder(SystemColor.inactiveCaptionBorder));
        jPanel1.setBackground(Color.WHITE);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu2.setFont(new Font("Dialog", Font.PLAIN, 16));
        appar = new javax.swing.JMenuItem();
        appar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        maison = new javax.swing.JMenuItem();
        maison.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        terrain = new javax.swing.JMenuItem();
        terrain.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        centrecommercial = new javax.swing.JMenuItem();
        centrecommercial.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Immobilière");
        
        table = new JTable();
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo_sotrim.jpg")));
        
        JLabel lblNewLabel = new JLabel("Vous pouvez par la suite ajouter des immeubles , des locataires , des propri\u00E9taires , des contrats ... ");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(232)
        					.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(89)
        					.addComponent(label)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(133, Short.MAX_VALUE)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 856, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(92)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
        			.addGap(43)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jMenu2.setText("Gestion des bien immeubles");

        appar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo_appartement_immobilier_lardreau.jpg"))); // NOI18N
        appar.setText("Appartement");
        jMenu2.add(appar);
        appar.addActionListener(new java.awt.event.ActionListener ()
		{
			public void actionPerformed(java.awt.event.ActionEvent e )
			{
				GestionApparI a = new GestionApparI();
	        	a.setVisible(true);
			}
			 
		});

        maison.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/maison - Copie.png"))); // NOI18N
        maison.setText("Maison");

        jMenu2.add(maison);
        maison.addActionListener(new java.awt.event.ActionListener ()
     		{
     			public void actionPerformed(java.awt.event.ActionEvent e )
     			{
     				GestionMaisonI ma = new GestionMaisonI();
     	        	ma.setVisible(true);
     			}
     			 
     		});

        terrain.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo-terrain.jpg"))); // NOI18N
        terrain.setText("Terrain");
        jMenu2.add(terrain);
        terrain.addActionListener(new java.awt.event.ActionListener ()
 		{
 			public void actionPerformed(java.awt.event.ActionEvent e )
 			{
 				GestionTerrainI te = new GestionTerrainI();
 	        	te.setVisible(true);
 			}
 			 
 		});
        centrecommercial.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo-locauxcommerciaux.jpg"))); // NOI18N
        centrecommercial.setText("Centre Commercial");

        jMenu2.add(centrecommercial);
        centrecommercial.addActionListener(new java.awt.event.ActionListener ()
 		{
 			public void actionPerformed(java.awt.event.ActionEvent e )
 			{
 				GestionCentreCommercialI cc = new GestionCentreCommercialI();
 	        	cc.setVisible(true);
 			}
 			 
 		});
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        mnCrationContrat = new JMenu("Gestion des Contrats");
        mnCrationContrat.setFont(new Font("Dialog", Font.PLAIN, 16));
        mnCrationContrat.setBackground(Color.BLACK);
        jMenuBar1.add(mnCrationContrat);

        mntmContratDeLocation = new JMenuItem("Contrat de location");
        mntmContratDeLocation.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        mntmContratDeLocation.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/100915_contrat.jpg")));
        mnCrationContrat.add(mntmContratDeLocation);
        mntmContratDeLocation.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  				GestionContratLocationI l= new GestionContratLocationI();
				l.setVisible(true);
  			}
  			 
  		});
        
        
        mntmConratDachat = new JMenuItem("Contrat d'achat");
        mntmConratDachat.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        mntmConratDachat.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/a\u00E9ra.jpg")));
        mnCrationContrat.add(mntmConratDachat);
        mntmConratDachat.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  			
  			}
  			 
  		});
        
        client = new JMenu("Gestion des Clients");
        client.setFont(new Font("Dialog", Font.PLAIN, 16));
        client.setBackground(Color.BLACK);
        jMenuBar1.add(client);        
        
        mntmClients = new JMenuItem("Clients");
        mntmClients.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        mntmClients.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/locataires.png")));
        client.add(mntmClients);
        mntmClients.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  			GestionClient c = new GestionClient();
  			c.setVisible(true);
  			}
  			 
  		});
        
        
        
        mntmProprietaires = new JMenuItem("Proprietaires");
        mntmProprietaires.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        mntmProprietaires.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/proprietaire.png")));
        client.add(mntmProprietaires);
        mntmProprietaires.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  			GestionProprietaire c = new GestionProprietaire();
  			c.setVisible(true);
  			}
  			 
  		});
        
        
        
        
        aide = new JMenu("Aide");
        aide.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jMenuBar1.add(aide);
        aide.addActionListener(new java.awt.event.ActionListener ()
  		{
  			public void actionPerformed(java.awt.event.ActionEvent e )
  			{
  				aide c = new aide();
  			c.setVisible(true);
  			}
  			 
  		});
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 890, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(62, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }                                 
    private javax.swing.JMenuItem centrecommercial;
    private javax.swing.JMenuItem maison;
    private javax.swing.JMenuItem terrain;
    private javax.swing.JMenuItem appar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private JMenu mnCrationContrat;
    private JMenu client;
    private JMenuItem mntmContratDeLocation;
    private JMenuItem mntmConratDachat;
    private JTable table;
    private JMenu aide;
    private JMenuItem mntmClients;
    private JMenuItem mntmProprietaires;
}
