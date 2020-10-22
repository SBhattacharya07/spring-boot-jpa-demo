package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ContactsRepo;
import com.example.demo.Entities.Contacts;

@Service
public class ContactsService {

	@Autowired
	ContactsRepo repo;

	public Contacts getContact(String cName) {
		return repo.findById(cName).orElse(null);
	}

	public Contacts create(Contacts contact) {
		return repo.save(contact);
	}

	public Iterable<Contacts> getAllContact() {
		return repo.findAll();
	}

}
