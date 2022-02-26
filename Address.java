package com.home.dk;

public class Address {
	private String state;
	private String city;
	private String street;

//	Address() {
//	System.out.println("Default Con Address");
//	}

	public Address(String state, String city, String street) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
	}

	public Address(Address address) {
		this(address.getCity(), address.getState(), address.getStreet());
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", street=" + street + "]";
	}
 static  Address getInstance(Address address) {
	return  new Address(address.getCity(),address
			.getState(),address.getStreet());

			
}
}
