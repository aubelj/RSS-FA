package com.rssfa.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rssfa.models.FlowModel;
import com.rssfa.views.FlowView;

public class FlowController extends AbstractController{

	private FlowModel model;
	private FlowView view;
	private ActionListener actionListener;

	public FlowController(FlowModel model, FlowView view){
		this.model = model;
		this.view = view;

		this.control();
	}
	
	/*
	 * Initalisation de la liste
	 */
	public void load()
	{
		model.refreshList();
	}

	/*
	 * Initalisation du gestionnaire d'évenements
	 */
	public void control() {

		// Add Button
		view.getAddButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!view.getTfName().getText().isEmpty()) {
					view.getLmName().removeAllElements();
					view.getNamensliste().add(view.getTfName().getText());
					view.getTfName().setText("");
					for(String tmpName:view.getNamensliste())
					{
						view.getLmName().addElement(tmpName);
					}
				}
			}
		});   
	}
}
