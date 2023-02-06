package org.tnsif.classobjects;
//To demonstrate the program on "this" keyword.
public class Customer {
	private int id;
	private String Customername;
	private String City;
	
	//default constructor
	public Customer() {
		
	}
	//parameterized constructor
	public Customer(int id, String Customername, String City) {
		this.id = id;
		this.Customername = Customername;
		this.City = City;
	}
	
	void display() {
		System.out.println(id+" "+Customername+" "+City);
	}
	
	
	
	//getter-setter methods provided for variables that are private so that we can access them in another class named "CustomerDemo"
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	

}
