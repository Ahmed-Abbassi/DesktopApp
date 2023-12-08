package presentation;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class View extends JFrame{

	//holly pannels
	JPanel mainPannel = new JPanel();
	
	JPanel namePannel = new JPanel();
	JPanel SurnamePannel = new JPanel();
	JPanel filierePannel = new JPanel();
	JPanel sexePannel = new JPanel();
	JPanel topPannel = new JPanel();
	JPanel Aj_An_Pannel = new JPanel();
	JPanel gridFour = new JPanel();
	JPanel rechercherPannel = new JPanel();
	
	JPanel bottomPannel = new JPanel();
	//table
	JTable table = new JTable();
	JPanel
	tabPannel = new JPanel();
	//holly labels
	JLabel nameLabel = new JLabel("nom: ");
	JLabel surnameLabel = new JLabel("Prenom: ");
	JLabel filiereLabel = new JLabel("Filiere: ");
	JLabel sexeLabel = new JLabel("sexe: ");
	JLabel chercherLaebel = new JLabel("chercher par mot cle");
	
	JTextField nameTexte = new JTextField(20);
	JTextField surnameTexte = new JTextField(20);
	JTextField chercherTexte = new JTextField(20);
	
	//holly buttons
	JButton ajouterButton = new JButton("Ajouter");
	JButton annulerButton = new JButton("annuler");
	JButton rechercherButton = new JButton("Rechercher");
	
	//holly comboBox
	String tab[] = {"Multimedia", "telecom", "genie Logiciel", "reseau"};
	JComboBox<String> filiereComboBox = new JComboBox<String>(new DefaultComboBoxModel<String>(tab) );
	//holly radio button
	JRadioButton hrb = new JRadioButton();
	JRadioButton frb = new JRadioButton();
	
	public View() {
		setVisible(true);
		namePannel.setLayout(new FlowLayout());
		namePannel.add(nameLabel);
		namePannel.add(nameTexte);
		mainPannel.add(namePannel);
		SurnamePannel.setLayout(new FlowLayout());
		SurnamePannel.add(surnameLabel);
		SurnamePannel.add(surnameTexte);
		
		filierePannel.setLayout(new FlowLayout());
		filierePannel.add(filiereLabel);
		filierePannel.add(filiereComboBox);
		
		sexePannel.setLayout(new FlowLayout());
		sexePannel.add(sexeLabel);
		sexePannel.add(hrb);
		sexePannel.add(frb);
		ButtonGroup btnGroup  = new ButtonGroup();
		btnGroup.add(hrb);
		btnGroup.add(frb);
		
		
		gridFour.setLayout(new GridLayout(2,2));
		
		gridFour.add(namePannel);
		gridFour.add(SurnamePannel);
		gridFour.add(filierePannel);
		gridFour.add(sexePannel);
		
		Aj_An_Pannel.setLayout(new FlowLayout());
		Aj_An_Pannel.add(ajouterButton);
		Aj_An_Pannel.add(annulerButton);
		
		topPannel.setLayout(new BoxLayout(topPannel, BoxLayout.Y_AXIS));
		topPannel.add(gridFour);
		topPannel.add(Aj_An_Pannel);
		
		TitledBorder border = new TitledBorder("informations etudiant");
		
		topPannel.setBorder(border);
		rechercherPannel.setLayout(new FlowLayout());
		 rechercherPannel.add(chercherLaebel);
		 rechercherPannel.add(chercherTexte);
		
		 bottomPannel.setLayout(new FlowLayout());
		 bottomPannel.add(chercherLaebel);
		 bottomPannel.add(chercherTexte);
		 bottomPannel.add(rechercherButton);
		 
		 mainPannel.setLayout(new BoxLayout(mainPannel, BoxLayout.Y_AXIS));
		 mainPannel.add(topPannel);
		 mainPannel.add(bottomPannel);
		
		
		add(mainPannel);
		
		pack();
		
	}
	
	
	
}
