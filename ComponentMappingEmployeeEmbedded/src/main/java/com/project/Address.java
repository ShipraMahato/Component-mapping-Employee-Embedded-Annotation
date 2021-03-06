package com.project;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
@Column(length=30)
	private String city;
@Column(length=30)
private String state;
private int pincode;

public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
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
public Address(String city, String state, int pincode) {
	super();
	this.city = city;
	this.state = state;
	this.pincode= pincode;
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}



}
