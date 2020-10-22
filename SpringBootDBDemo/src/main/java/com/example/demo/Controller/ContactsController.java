package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Contacts;
import com.example.demo.Service.ContactsService;

@RestController
@RequestMapping(value = "/contacts")
public class ContactsController {

	@Autowired
	ContactsService cservice;

	@PutMapping(value = "/create")
	public Contacts create(Contacts contact) {
		return cservice.create(contact);
	}

	@GetMapping(value = "/get/{cname}")
	public Contacts getContact(@PathVariable("cname") String cName) {
		return cservice.getContact(cName);

	}
	
	@GetMapping(value="/getall")
	public Iterable<Contacts> getAllContact() {
		return cservice.getAllContact();

	}

}
