package com.rssfa.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rssfa.models.EntryModel;
import com.rssfa.views.EntryView;

public class EntryController extends AbstractController {

	private EntryModel model;
	private EntryView view;
	private ActionListener actionListener;

	public EntryController(EntryModel model, EntryView view) {
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
