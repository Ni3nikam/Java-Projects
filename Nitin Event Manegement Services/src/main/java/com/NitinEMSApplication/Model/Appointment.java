package com.NitinEMSApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {

	String services;
	String event;
	String name;
	@Id
	String email;
	String appdate;
	String apptime;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(String services, String event, String name, String email, String appdate, String apptime) {
		super();
		this.services = services;
		this.event = event;
		this.name = name;
		this.email = email;
		this.appdate = appdate;
		this.apptime = apptime;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getevent() {
		return event;
	}

	public void setevent(String event) {
		this.event = event;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAppdate() {
		return appdate;
	}

	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}

	public String getApptime() {
		return apptime;
	}

	public void setApptime(String apptime) {
		this.apptime = apptime;
	}

	@Override
	public String toString() {
		return "Appointment [services=" + services + ", doctors=" + event + ", name=" + name + ", email=" + email
				+ ", appdate=" + appdate + ", apptime=" + apptime + "]";
	}

}