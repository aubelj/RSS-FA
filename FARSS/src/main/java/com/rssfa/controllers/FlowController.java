package com.rssfa.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;

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
	 * Initalisation du gestionnaire d'évenements
	 */
	public void control() {
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

		//		btnNewButton.addActionListener(new ActionListener() {
		//		public void actionPerformed(ActionEvent arg0) 
		//		{
		//			lmName.removeAllElements();
		//			namensliste.add(tfName.getText());
		//			tfName.setText("");
		//			for(String tmpName:namensliste)
		//			{
		//				lmName.addElement(tmpName);
		//			}
		//		}
		//	});

		//		actionListener = new ActionListener() {
		//			public void actionPerformed(ActionEvent actionEvent) {                  
		//				linkBtnAndLabel();
		//			}
		//		};                
		//		view.getButton().addActionListener(actionListener);   
	}
	//
	//	private void linkBtnAndLabel(){
	//		model.incX();                
	//		view.setText(Integer.toString(model.getX()));
	//	}    
}
