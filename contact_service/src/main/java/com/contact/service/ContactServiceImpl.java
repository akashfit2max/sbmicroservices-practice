package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contack.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

//	fake contact list
	List<Contact> list = List.of(new Contact(1L, "shubham@gmail.com", "shubham ", 1311L),
			new Contact(2L, "anwesh@gmail.com", "anwesh", 1311L), new Contact(3L, "rahul@gmail.com", "rahul", 1312L),
			new Contact(4L, "mamata@gmail.com", "mamata", 1314L)

	);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
