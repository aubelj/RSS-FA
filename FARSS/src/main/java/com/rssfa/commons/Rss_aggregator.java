package com.rssfa.commons;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import com.rssfa.models.*;
import com.rssfa.controllers.*;
import com.rssfa.views.*;

public class Rss_aggregator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1291166688231267998L;
	private JFrame frame;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rss_aggregator window = new Rss_aggregator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rss_aggregator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("RSS Feed Aggregator");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1300, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Gestionnaire de flux
		FlowModel flowModel = new FlowModel();
        FlowView flowView = new FlowView(frame); 
        FlowController flowController = new FlowController(flowModel, flowView);
		
		// Gestionnaire d'entrées
        EntryModel entryModel = new EntryModel();
        EntryView entryView = new EntryView(frame);
//        EntryController entryController = new EntryController(entryModel, entryView);

		// Gestionnaire de contenu
        ContentModel contentModel = new ContentModel();
        ContentView contentView = new ContentView(frame); 
//        ContentController contentController = new ContentController(contentModel, contentView);
        
		// Panel Top
		panel = new JPanel();
		panel.setBounds(0, 0, 1300, 40);
		panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.getContentPane().add(panel);
	}
}
