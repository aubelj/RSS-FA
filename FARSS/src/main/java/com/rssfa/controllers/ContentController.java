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
	}
}
