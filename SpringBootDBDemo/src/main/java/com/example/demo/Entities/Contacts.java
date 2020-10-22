package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contacts {

	@Id
	private String cName;
	private String cEmail;
	private long cMobile;
	private String cUrl;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public long getcMobile() {
		return cMobile;
	}
	public void setcMobile(long cMobile) {
		this.cMobile = cMobile;
	}
	public String getcUrl() {
		return cUrl;
	}
	public void setcUrl(String cUrl) {
		this.cUrl = cUrl;
	}
	@Override
	public String toString() {
		return "Contacts [cName=" + cName + ", cEmail=" + cEmail + ", cMobile=" + cMobile + ", cUrl=" + cUrl + "]";
	}
	
	
}
