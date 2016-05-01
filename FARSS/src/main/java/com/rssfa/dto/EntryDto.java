package com.rssfa.dto;

import java.sql.Date;

public class EntryDto {

	private Integer id;
	private String title;
	private String description;
	private String author;
	private String link;
	private String guid;
	private String category;
	private Date publish_date;

	public EntryDto() {
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

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	public Date getPublishDate() {
		return publish_date;
	}

	public void setPublishDate(Date publish_date) {
		this.publish_date = publish_date;
	}
}
