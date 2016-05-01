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
//		// Add Bouton
//		addButton = new JButton("");
//		addButton.setBorderPainted(false);
//		addButton.setContentAreaFilled(false);
//		addButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("images/plus-5-24.png")));
//		addButton.setBounds(10, 11, 30, 30);
//		frame.getContentPane().add(addButton);
//		
//		// Refresh Button
//		refreshButton = new JButton("");
//		refreshButton.setBorderPainted(false);
//		refreshButton.setContentAreaFilled(false);
//		refreshButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("images/refresh-24.png")));
//		refreshButton.setBounds(73, 11, 30, 30);
//		frame.getContentPane().add(refreshButton);
//		
//		// Text Field
//		tfName = new JTextField();
//		tfName.setBounds(46, 89, 192, 20);
//		frame.getContentPane().add(tfName);
//		tfName.setColumns(10);
//		
//		//
//		scrollPane = new JScrollPane();
//		scrollPane.setBounds(10, 147, 228, 399);
//		frame.getContentPane().add(scrollPane);
//		
//		//
//		panel = new JPanel();
//		panel.setBounds(0, 0, 969, 25);
//		frame.getContentPane().add(panel);
//		
//		// Liste de flux
//		lfName = new JList(lmName);
//		scrollPane.setViewportView(lfName);
//		
//		// Input nouveau flux
//		lblUrl = new JLabel("URL");
//		lblUrl.setBounds(10, 92, 46, 14);
//		frame.getContentPane().add(lblUrl);
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
