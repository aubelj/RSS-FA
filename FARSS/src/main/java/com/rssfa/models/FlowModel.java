package com.rssfa.models;

import java.sql.Connection;
import java.util.List;

import com.rssfa.commons.ConnectionHandler;
import com.rssfa.dto.FlowDto;

public class FlowModel extends AbstractModel {

	private List<FlowDto> list;
	private ConnectionHandler conh;
	private Connection con;
	
	public FlowModel() {
		 conh = new ConnectionHandler();
//		 con = conh.getInstance();
	}
	
	public void refreshList() {

	}
	
	public List <FlowDto> getList() {
		return list;
	}
	
}
