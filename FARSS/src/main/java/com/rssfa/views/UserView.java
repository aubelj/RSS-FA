package com.rssfa.views;

import java.util.ArrayList;

import javax.swing.*;

public class UserView {
	private JFrame frame;
	private JPasswordField passwordField;
	private JButton signInButton;
	private JButton signUpButton;
	private JButton loginButton;
	private JButton logoutButton;
	private JTextField tfName;
	private JScrollPane scrollPane;
	private JList lfName;
	JLabel lblUrl;
	
	private DefaultListModel<String> lmName = new DefaultListModel<String>();
	private ArrayList<String> namensliste = new ArrayList<String>();

	
	public UserView(JFrame frame) {
		this.frame = frame;
	}

    public DefaultListModel getLmName(){
        return lmName;
    }

    public JTextField getTfName(){
        return tfName;
    }
    
    public ArrayList<String> getNamensliste(){
        return namensliste;
    }
}
