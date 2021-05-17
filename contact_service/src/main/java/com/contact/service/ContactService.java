package com.contact.service;

import java.util.List;

import com.contack.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);

}
