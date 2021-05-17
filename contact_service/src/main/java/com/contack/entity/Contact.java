package com.contack.entity;

public class Contact {

	private Long cId;
	private String emial;
	private String contactName;

	private Long userId;

	public Contact(Long cId, String emial, String contactName, Long userId) {
		this.cId = cId;
		this.emial = emial;
		this.contactName = contactName;
		this.userId = userId;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
