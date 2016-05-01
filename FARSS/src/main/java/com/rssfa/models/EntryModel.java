package com.rssfa.models;

import java.sql.Connection;
import java.util.List;

import com.rssfa.commons.ConnectionHandler;
import com.rssfa.dto.EntryDto;
import com.rssfa.dto.EntryDto;

public class EntryModel extends AbstractModel {
	
	private List<EntryDto> list;
	private ConnectionHandler conh;
	private Connection con;
	
	public EntryModel() {
		 conh = new ConnectionHandler();
//		 con = conh.getInstance();
	}
	
}
