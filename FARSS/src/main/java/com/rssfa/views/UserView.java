package com.rssfa.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;

public class UserView {
	private JFrame frame;
	private JPanel panel;
	private JLabel title;
	private JLabel emaillabel;
	private JLabel invalidLabel;
	private JLabel passwordlabel;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JButton signUpButton;
	private JButton loginButton;
	private JButton logoutButton;
	
	private DefaultListModel<String> lmName = new DefaultListModel<String>();
	private ArrayList<String> namensliste = new ArrayList<String>();

	
	public UserView(JFrame frame) {
		this.frame = frame;
		
		// JLabel
		title = new JLabel();
		title.setText("Connexion à votre espace");
		title.setFont((title.getFont().deriveFont(15.0f)));
		title.setBounds(550, 230, 300, 20);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		frame.getContentPane().add(title);

		// email Label
		emaillabel = new JLabel("Email");
		emaillabel.setBounds(500, 300, 50, 20);
		frame.getContentPane().add(emaillabel);
		
		// password Label
		passwordlabel = new JLabel("Mot de passe");
		passwordlabel.setBounds(500, 350, 100, 20);
		frame.getContentPane().add(passwordlabel);
		
		// email Field
		emailField = new JTextField();
		emailField.setBounds(600, 300, 210, 20);
		frame.getContentPane().add(emailField);
		emailField.setColumns(10);

		// password Field
		passwordField = new JPasswordField();
		passwordField.setBounds(600, 350, 210, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		// login Bouton
		loginButton = new JButton("Se connecter");
		loginButton.setBorderPainted(true);
		loginButton.setContentAreaFilled(true);
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(Color.DARK_GRAY);
		loginButton.setBounds(500, 420, 150, 30);
		frame.getContentPane().add(loginButton);

		// login Bouton
		signUpButton = new JButton("S'inscrire");
		signUpButton.setBorderPainted(true);
		signUpButton.setContentAreaFilled(true);
		signUpButton.setForeground(Color.WHITE);
		signUpButton.setBackground(Color.LIGHT_GRAY);
		signUpButton.setBounds(660, 420, 149, 30);
		frame.getContentPane().add(signUpButton);
		
		// Panel
		panel = new JPanel();
		panel.setBounds(400, 200, 500, 300);
		panel.setBackground(new Color(250, 250, 250));
		panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.getContentPane().add(panel);
	}

	public void setErrorLogin() {
		// invalid Label
		invalidLabel = new JLabel("Informations incorrectes");
		invalidLabel.setForeground(Color.RED);
		invalidLabel.setBounds(580, 390, 200, 20);
		frame.getContentPane().add(invalidLabel);
	}
	
    public JPasswordField getPassword(){
        return passwordField;
    }

    public JTextField getEmail(){
        return emailField;
    }
    
    public ArrayList<String> getNamensliste(){
        return namensliste;
    }
    
    public JButton getLoginButton() {
    	return loginButton;
    }
}
