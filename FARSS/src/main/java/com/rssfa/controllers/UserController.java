package com.rssfa.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rssfa.models.UserModel;
import com.rssfa.views.UserView;
import com.rssfa.commons.Rss_aggregator;

public class UserController extends AbstractController{

	private Rss_aggregator rssManager;
	private UserModel model;
	private UserView view;
	private ActionListener actionListener;

	public UserController(Rss_aggregator rssManager, UserModel model, UserView view){
		this.model = model;
		this.view = view;
		this.rssManager = rssManager;
		
		this.control();
	}
	
	public UserController(UserModel model, UserView view){
		this.model = model;
		this.view = view;

		this.control();
	}

	/*
	 * Initalisation du gestionnaire d'évenements
	 */
	public void control() {
		
		// login Button
		view.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!view.getEmail().getText().isEmpty() && !view.getPassword().getPassword().toString().isEmpty()) {
					rssManager.load();
				} else {
					view.setErrorLogin();
				}
			}
		}); 
	}
}
