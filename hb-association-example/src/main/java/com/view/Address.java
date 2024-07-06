package com.view;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address121")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int addrId;
	String lin1,line2,city,state;
	int pin;
	@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL)
	Employee e;
	public Address() {
		super();
	}
	public Address(int addrId, String lin1, String line2, String city, String state, int pin, Employee e) {
		super();
		this.addrId = addrId;
		this.lin1 = lin1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.e = e;
	}
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getLin1() {
		return lin1;
	}
	public void setLin1(String lin1) {
		this.lin1 = lin1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
   

}
