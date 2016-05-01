package com.rssfa.models;

import java.sql.Connection;
import java.util.List;

import com.rssfa.commons.ConnectionHandler;
import com.rssfa.dto.FlowDto;

public class UserModel extends AbstractModel {

	private ConnectionHandler conh;
	private Connection con;
	
	public UserModel() {
		 conh = new ConnectionHandler();
//		 con = conh.getInstance();
	}
	
	public void login(final String email, final String password) {
		
	}
}
