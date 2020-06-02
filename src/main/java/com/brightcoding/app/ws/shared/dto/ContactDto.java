package com.brightcoding.app.ws.shared.dto;

public class ContactDto {

	private long id;
	private String contactId;
	private String mobile;
	private String skype;
	private UserDto user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSkype() {
		return skype;
	}
	public void setSkype(String skype) {
		this.skype = skype;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	
	
	
}
