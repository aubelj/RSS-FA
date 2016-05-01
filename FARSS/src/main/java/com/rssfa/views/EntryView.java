package com.rssfa.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;

public class EntryView {
	private JFrame frame;
	private JButton addButton;
	private JButton refreshButton;
	private JPanel panel;
	private JTextField tfName;
	private JScrollPane scrollPane;
	private JList lfName;
	JLabel lblUrl;
	
	private DefaultListModel lmName = new DefaultListModel();
	private ArrayList<String> namensliste = new ArrayList<String>();

	
	public EntryView(JFrame frame) {
		this.frame = frame;
		
		// Scrollable Zone
		scrollPane = new JScrollPane();
		scrollPane.setBounds(280, 50, 249, 600);
		frame.getContentPane().add(scrollPane);

		// Item list
		lfName = new JList(lmName);
		scrollPane.setViewportView(lfName);

		
		panel = new JPanel();
		panel.setBounds(269, 39, 270, 700);
		panel.setBackground(new Color(250, 250, 250));
		panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.getContentPane().add(panel);
	}
	
    public JButton getRefreshButton(){
        return refreshButton;
    }
    
    public JButton getAddButton(){
        return addButton;
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
