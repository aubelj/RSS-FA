package com.rssfa.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;

import com.rssfa.models.ContentModel;
import com.rssfa.views.ContentView;

public class ContentController extends AbstractController {

	private ContentModel model;
	private ContentView view;
	private ActionListener actionListener;

	public ContentController(ContentModel model, ContentView view) {
		this.model = model;
		this.view = view;
		
		this.control();
	}
	
	/*
	 * Initalisation du gestionnaire d'évenements
	 */
	public void control() {
		view.getAddButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				view.getLmName().removeAllElements();
				view.getNamensliste().add(view.getTfName().getText());
				view.getTfName().setText("");
				for(String tmpName : view.getNamensliste())
				{
					view.getLmName().addElement(tmpName);
				}
			}
		});
	}
}
