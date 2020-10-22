package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entities.Contacts;

public interface ContactsRepo extends CrudRepository<Contacts, String>{

}
