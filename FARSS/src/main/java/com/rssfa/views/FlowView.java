package com.rssfa.views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;

public class FlowView {
	
	private static Integer FLOW_WIDTH = 300;
	private static Integer FLOW_HEIGHT = 700;
	
	private JFrame frame;
	private FlowLayout flowLayout;
	private JPanel panel;
	private JButton addButton;
	private JButton refreshButton;
	private JLabel title;
	private JTextField tfName;
	private JScrollPane scrollPane;
	private JList lfName;
	JLabel lblUrl;
	
	private DefaultListModel<String> lmName = new DefaultListModel<String>();
	private ArrayList<String> namensliste = new ArrayList<String>();

	
	public FlowView(JFrame frame) {
		this.frame = frame;
				
		// Add Bouton
		addButton = new JButton("");
		addButton.setBorderPainted(false);
		addButton.setContentAreaFilled(false);
		addButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("images/plus-5-24.png")));
		addButton.setBounds(5, 5, 30, 30);
		frame.getContentPane().add(addButton);
		
		// Refresh Button
		refreshButton = new JButton("");
		refreshButton.setBorderPainted(false);
		refreshButton.setContentAreaFilled(false);
		refreshButton.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("images/refresh-24.png")));
		refreshButton.setBounds(40, 5, 30, 30);
		frame.getContentPane().add(refreshButton);
		
		// JLabel Field
		title = new JLabel();
		title.setText("FLUX RSS");
		title.setFont((title.getFont().deriveFont(15.0f)));
		title.setBounds(95, 55, 100, 20);
		frame.getContentPane().add(title);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		
		// Text Field
		tfName = new JTextField();
		tfName.setBounds(50, 89, 210, 20);
		frame.getContentPane().add(tfName);
		tfName.setColumns(10);
		
		// Scrollable Zone
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 250, 500);
		frame.getContentPane().add(scrollPane);

		// Item list
		lfName = new JList(lmName);
		scrollPane.setViewportView(lfName);

		// Input new flow
		lblUrl = new JLabel("URL");
		lblUrl.setBounds(10, 90, 50, 15);
		frame.getContentPane().add(lblUrl);
		
		panel = new JPanel();
		panel.setBounds(0, 39, 270, FLOW_HEIGHT);
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
