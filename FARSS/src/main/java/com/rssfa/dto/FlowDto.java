package com.rssfa.dto;

import java.sql.Date;

public class FlowDto {

	private Integer id;
	private String title;
	private String url;
	private String language;
	private String path;
	private Date last_update;

	public FlowDto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getLastUpdate() {
		return last_update;
	}

	public void setLastUpdate(Date last_update) {
		this.last_update = last_update;
	}
}
